package Nks6;

class Tv2 {
    String Color;
    boolean power;
    int channel;

    void power()  { power = !power; }
    void channelUP()   {  ++channel;  }
    void channelDown() {  --channel;  }
}
class TvTest2{
    public static void main(String[] args) {
        Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        t1.setChannelDown();
        System.out.println("t1 channel값을 6으로 변경합니다.");
        t2 = t1;

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}
