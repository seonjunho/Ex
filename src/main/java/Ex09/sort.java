package Ex09;

import java.util.Scanner;

public class sort {
    static int[] arr(int[] arr){
        for(int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];

        for(int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
            arr(ar);
        for(int i = 0; i < 5; i++)
            System.out.printf(ar[i]+ " ");
    }
}
