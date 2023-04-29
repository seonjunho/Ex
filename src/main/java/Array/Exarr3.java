package Array;

import java.util.Scanner;

public class Exarr3 {
    public static void main(String[] args) {
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("값 입력 : \n");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        for (int i = 0; i < 2; i++) {
        }
        System.out.printf("평균: "+ average +"결과: " + sum);
        System.out.println("입니다.");

    }
}
