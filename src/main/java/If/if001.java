package If;

import java.util.Scanner;

public class if001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("구분 수 입력 : ");
        a = sc.nextInt();

        if(a%2==1){
            System.out.println("홀.");
        } else if(a%2==0){
            System.out.println("짝.");
        }
    }
}
