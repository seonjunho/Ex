package Nks6;

public class TvTest4 {
    public static void main(String args[]) {
        Tv1[] tvarr = new Tv1[3];

        for (int i = 0; i < tvarr.length; i++) {
            tvarr[i] = new Tv1();
            tvarr[i].channel = i + 10; // tvarr[i]의 channel에 i+10을 저장
        }
        for (int i = 0; i < tvarr.length; i++) {
            tvarr[i].channelUp();
            System.out.printf("tvarr[%d].channel=%d\n", i, tvarr[i].channel);
        }
    }
}

class Tv1 {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
