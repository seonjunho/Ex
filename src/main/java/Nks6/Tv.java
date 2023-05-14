package Nks6;

class Tv {

    String color;       //색상
    boolean power;      //전원(on/off)
    int channel;        //채널

    void power()     {  power =  !power; }  // Tv를 키거나 끄는 메서드
    void setChannelUP()   {  ++channel;  }  // 채널을 높이는 기능의 메서드
    void setChannelDown() {  --channel;  }  // 채널을 낮추는 기능의 메서드
}
class TvTest{
    public static void main(String[] args) {
        Tv  t;                   // Tv인스턴스를 참조하기 위한 변수 t 선언
        t = new Tv();            // Tv인스턴스를 생성
        t.channel = 7;           // Tv인스턴스의 멤버변수 channel의 값을 7로 설정
        t.setChannelDown();      // Tv인스턴스의 메서드 channelDown() 메서드를 호출한다.
        System.out.println("현재 채넣은 "+ t.channel + " 입니다. ");
    }
}
