package study;
class Hello {
    public static void hello() {System.out.println("hello");}
    public static void word(){System.out.println("word!");}
    public static String Helloword(){return "Helloword!";}
}
public class HelloTest extends Hello{
    public static void main(String[] args) {
       hello();
       word();
       System.out.println(Helloword());
    }
}
