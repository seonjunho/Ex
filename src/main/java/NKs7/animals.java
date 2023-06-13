package NKs7;

class exanimal {
    void eat(){
        System.out.println("먹는다.");
    }
    void howl(){
        System.out.println("운다");
    }
    void moving(){
        System.out.println("움직인다.");
    }
}
class dog extends exanimal{
    @Override
    void howl(){
        System.out.println("멍멍!!");
    }
    void age(){
        System.out.println("3살이다.");
    }
}
public class animals {
    public static void main(String[] args) {
        dog dg = new dog();
        dg.age();
        dg.eat();
        dg.howl();
        dg.moving();
    }
}


