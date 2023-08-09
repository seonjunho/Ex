package NKs7;

public class BindingTest2 {
    public static void main(String[] args) {
        sParent P = new sChild();
        sChild C = new sChild();

        System.out.println("p.x = " + P.x);
        P.method();
        System.out.println();
        System.out.println("c.x = " + C.x);
        C.method();
    }
}

class sParent{
    int x = 100;
    void method(){
        System.out.println("sParent Method");
    }
}
class sChild extends sParent{
    int x = 200;
    void method(){
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
    }
}