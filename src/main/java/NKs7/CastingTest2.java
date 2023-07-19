package NKs7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new FireEngine();
//        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; //에러 발생! 참조하는 조상 객체의 멤버수가 자손타입의 멤버수 보다 적음!
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
