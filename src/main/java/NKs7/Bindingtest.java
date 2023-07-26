package NKs7;

public class Bindingtest {
    public static void main(String[] args) {
        myParent p = new myChild();
        myChild c =new myChild();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class myParent{
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}
class myChild extends myParent{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}
