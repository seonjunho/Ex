package Array;

import java.util.Scanner;

public class arrMax {
    public static void main(String[] args) {
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
