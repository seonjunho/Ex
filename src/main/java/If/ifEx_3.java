package If;

import java.util.Scanner;

public class ifEx_3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input ==0){
            System.out.println("입력하신 숫자는 0번입니다.");
        }else{
            System.out.println("입력하신 숫자는 0번이 아닙니다.");
        }
    }
}
//        if(input ==0)
//            System.out.println("입력하신 숫자는 0번입니다.");
//        else
//            System.out.println("입력하신 숫자는 0번이 아닙니다.");