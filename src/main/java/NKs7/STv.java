package NKs7;
class STv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void ChannelUp() { ++channel; }
    void ChannelDown() { --channel; }
}

class CaptionTv extends STv{
    boolean caption;
    void displaycaption(String text){
        if (caption){
            System.out.println(text);
        }
    }
}
class CaptionTvtest {
    public static void main(String args[]) {
        CaptionTv ctv= new CaptionTv();
        ctv.channel = 9;
        ctv.ChannelUp();
        System.out.println(ctv.channel);
        ctv.displaycaption("Hello, World");
        ctv.caption = true;
        ctv.displaycaption("Hello, World");

    }
}
