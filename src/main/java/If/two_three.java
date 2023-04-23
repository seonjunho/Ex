package If;

import java.util.Scanner;

public class two_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n;

        num = sc.nextInt();
        n = sc.nextInt();

        if(num%n==0){
            System.out.println("1");
        }else if(num%n!=0){
            System.out.println("0");
        }
    }
}
