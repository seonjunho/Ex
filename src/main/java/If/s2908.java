package If;

import java.util.Scanner;

public class s2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a < b ){
            System.out.println(550);
        }else{
            System.out.println(500);
        }
    }
}
