package Nks;

import java.util.Scanner;

public class Quiz09_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        System.out.print("값을 입력하세요 : \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        System.out.print("저장된 값은 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("입니다.");
    }
}

