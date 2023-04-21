package Array;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,9,8,5,1};

        for (int i = 0 ; i < arr.length-1; i++){
            for (int j = 0 ; j < arr.length - 1-i; j++){
                if (arr[j] > arr[j+1]) {
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j + 1] = tmp;
            }
        }
            System.out.println(i+"번 회전결과");
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
    }
}
}
