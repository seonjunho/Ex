package Ex;
class car{
    private String color;
    private int speed;

    car(String color,int speed){
        this.color=color;
        this.speed=speed;
    }
    public String getcolor(){
        return this.color;
    }
    public int getspeed(){
        return this.speed;
    }
}
public class car_1{
    public static void main(String[] args){
        car mycar1 = new car("빨강",50);
        car mycar2 = new car("검정", 50);
        System.out.println("자동차 1의 색상은"+mycar1.getcolor()+"이며, 현재 속도는"+mycar1.getspeed()+"입니다.");
        System.out.println("자동차 2의 색상은"+mycar2.getcolor()+"이며, 현재 속도는"+mycar2.getspeed()+"입니다.");
    }
}