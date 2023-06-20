package NKs7;
class CastingTset{
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine f2 = null;

        fe.water();
        car = fe;
        f2 = (FireEngine)car;
        f2.water();
        car.door = 4;
        car.color = "회색";

        System.out.println("car의 문 개수는"+car.door+"개 색상은 "+car.color+" 입니다." );
    }
}

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("부릉부릉, ~~");
    }
    void stop(){
        System.out.println("끼익~!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("쏴아아~");
    }
}
