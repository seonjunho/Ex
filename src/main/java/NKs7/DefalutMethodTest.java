package NKs7;

public class DefalutMethodTest {
    public static void main(String[] args) {
       MChild child = new MChild();
       child.method1();
       child.method2();
       Myinterface.staticmethod();
       MyInterface2.staticmethod();

    }
}
class MChild extends MParent implements Myinterface, MyInterface2{
    @Override
    public void method1(){
        System.out.println("method1() in MChild");
    }
}

class MParent{
    public void method2(){
        System.out.println("method2() in MParent");
    }
}
interface Myinterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticmethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1() {
        System.out.println("method1() int MyInterface2");
    }
    static void staticmethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}