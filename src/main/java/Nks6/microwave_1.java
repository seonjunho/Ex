package Nks6;

class microwave {
    int seconed;
    double temperature;

    void seconedUp() { ++seconed; }
    void seconedDown() {  --seconed; }

    void temperatureUp() { ++temperature; }
    void temperatureDown() { --temperature; }

    String color;
}
public class microwave_1{
    public static void main(String[] args) {

        microwave wave1 = new microwave();
        wave1.seconed = 30;
        wave1.temperature = 200;

        System.out.println("wave1의 현재 설정 초는"+wave1.seconed+"이며, 설정된 온도는"+wave1.temperature+"C입니다.");
    }
}
