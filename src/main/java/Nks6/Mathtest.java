package Nks6;

public class Mathtest {
    public static void main(String[] args) {
        Math mm = new Math();
        long result = mm.add(5L, 3L);

        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) =" + result);
        System.out.println("subtract(5L, 3L) =" + result2);
        System.out.println("mltiply(5L, 3L) =" + result3);
        System.out.println("divide(5L, 3L) =" + result4);
    }
}

class Math {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
