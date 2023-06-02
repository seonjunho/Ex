package Nks6;

class MemberCall {
    int iv = 0;
    static int cv = 20;
    int iv2 = cv;
//    static int cv2 = iv; // 에러. 클래스변수는 인스턴스 변수 사용 불가능
    static int cv2 = new MemberCall().iv; // 객체를 생성하면 사용가능

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticmethod2(){
        staticMethod1();
//        instanceMethod1(); //에러. 클래스 내에서는 인스턴스 메서드 호출불가.
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 객체를 생성한 후에 호출이 가능함
    }

    void intstanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }

}
