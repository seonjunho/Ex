package Array;

import java.util.Scanner;

public class arr1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = arr[0];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
