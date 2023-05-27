package Nks3;

public class Ex3_8 {
    public static void main(String[] args){
        int a = 1_000_000;        // int 는 10의 9제곱 까지 출력한다. 하지만 1,000,000 * 2,000,000은
        int b = 2_000_000;        // int 의 최대 출력값인 10의 9제곱을 초과한다. 그러므로 결과는 10의 12제곱이 아닌 오버플로우가 발생

        long c = a * b;           // a앞 (long) 으로 형변환시 값은 2,000,000,000,000 정상 출력됨

        System.out.println(c);


        int d = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d\n", d, d, d, result1); // int 최대값인 2x10(9)를 넘으므로 오버플로우 발생
        System.out.printf("%d / %d * %d = %d\n", d, d, d, result2);
    }

}
