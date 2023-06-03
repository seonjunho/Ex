package Array;

import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=1;i<ar.length;i++){
            int num = ar[i];
            int j = i-1;
            while(j>=0 && ar[j]>num){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1]=num;
        }

        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
