package C_ex;

import java.util.Scanner;
//나무 한그루 심기
public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 6 ; i++){
            for (int j = 0 ; j < 5-i ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i - 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i < 2; i++){
            for (int j = 0 ; j < 3; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 3  ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
