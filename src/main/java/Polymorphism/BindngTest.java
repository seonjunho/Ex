package Polymorphism;
class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}
public class BindngTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = "+ p.x);
        p.method();
        System.out.println("c.x = "+ c.x);
        c.method();
    }
    // static 으로 인한 업 불가능?
//    class Parent{
//        int x = 100;
//
//        void method(){
//            System.out.println("Parent Method");
//        }
//    }
//    class Child extends Parent{
//        int x = 200;
//
//        void method(){
//            System.out.println("Child Method");
//        }
//    }
}
