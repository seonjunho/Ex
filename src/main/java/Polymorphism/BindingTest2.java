package Polymorphism;
class Parents{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
public class BindingTest2 {
    public static void main(String[] args) {
        Parents p = new Childs();
        Childs c = new Childs();

        System.out.println("p.x = "+ p.x);
        p.method();
        System.out.println("c.x = "+ c.x);
        c.method();
    }
}
class Childs extends Parents{}