package Ex09;

import java.util.*;


public class reverse {
    static int[] reverseArray(int[] arr) {
        Arrays.sort(arr);
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
        reversedArr[i] = arr[arr.length -1 -i];
        }
        return reversedArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inarr = new int[5];

        System.out.println("저장할 값 : ");
        for (int i = 0; i < inarr.length; i++) {
            inarr[i] = sc.nextInt();
        }
        int[] outarr = reverseArray(inarr);


        for (int i = 0; i < inarr.length; i++) {
            System.out.print(outarr[i] + " ");
        }
    }
    }
