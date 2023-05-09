package Ex09;

import java.util.Scanner;

public class new_gugu {
    static void gugu(int dan){
        System.out.printf("< %d 단 >\n",dan);
        for (int i = 1; i < 10 ;i++){
            System.out.printf("%d X %d = %d\n",i,dan, i*dan);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단을 입력 하시오.");
        int dan = sc.nextInt();
        gugu(dan);
    }
}
