package Ex09;

import java.util.Scanner;

public class S1 {
    static int[] removearr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        ar = removearr(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int tmp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = tmp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.printf(ar[i] + " ");
        }
    }
}
