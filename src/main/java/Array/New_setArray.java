package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class New_setArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
       for(int num: set){
           System.out.print(num + ",");
       }
    }
}
