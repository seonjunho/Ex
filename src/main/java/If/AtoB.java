package If;

import java.util.Scanner;

public class AtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b){
            System.out.print(">");
        } else if (a < b) {
            System.out.println("<");
        } else{
            System.out.println("==");
        }
    }
}
