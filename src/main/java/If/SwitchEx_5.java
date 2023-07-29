package If;

import java.util.Scanner;

public class SwitchEx_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = ' ';
        System.out.println("점수를 입력하세요.>");

        switch (score/10){
            case 10:
            case 9:
                grade ='A';
                break;
            case 8:
            case 7:
                grade ='B';
                break;
            case 6:
                grade ='C';
                break;
            default:
                grade ='D';
        }
        System.out.printf("당신의 학점은 %c 입니다.",grade);
    }
}
