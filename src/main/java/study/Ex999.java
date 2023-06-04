package study;

import java.util.Scanner;

public class Ex999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        System.out.print("값을 입력 : \n");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            for(int j=0;j< i;j++){
                if(arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.print("출력 값은 : ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("입니다.");
    }
}
