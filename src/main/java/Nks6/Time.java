package Nks6;

class Time {
    private int hour;
    private int minute;
    private float second;

     Time(int hour, int minute, float second){
         this.hour = hour;
         this.minute = minute;
         this.second = second;
     }

    public int gethour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public float getSecond(){
        return this.second;
    }
}
class clock{
    public static void main(String[] args) {
        Time clock = new Time(3,50, 15);

        System.out.println("작업을 시작한지 "+clock.gethour()+"시간 "+clock.getMinute()+"분 "+ clock.getSecond()+"초가 지났습니다.");
    }
}