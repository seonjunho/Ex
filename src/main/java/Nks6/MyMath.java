package Nks6;

class MyMath {
    long a, b;

    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
    class MyMathTest2{
        public static void main(String args[]) {
//클래스 영역(cv)
            System.out.println(MyMath.add(200L,100L));
            System.out.println(MyMath.subtract(200L, 100L));
            System.out.println(MyMath.multiply(200L, 100L));
            System.out.println(MyMath.divide(200.0, 100.0));
//인스턴스 영역(iv)
            MyMath mm = new MyMath();
            mm.a = 200L;
            mm.b = 100L;

            System.out.println(mm.add());
            System.out.println(mm.subtract());
            System.out.println(mm.multiply());
            System.out.println(mm.divide());
    }
}
