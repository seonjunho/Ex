package Ex08;

import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int hap = 0, i;


        for (i = 0;i <= 3; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ",i +1);
            arr[i] = sc.nextInt();
        }
        hap = arr[1]+arr[2]+arr[3];
        double average = (double) hap/ arr.length;


        System.out.println("합계 ==> "+ hap );
        System.out.println("평균 ==> "+ average);
    }
}
