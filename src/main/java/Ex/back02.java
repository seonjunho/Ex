package Ex;

import java.util.Scanner;

public class back02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n ; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
