package Ex;

import java.util.Scanner;

//삼항연산자 활용해서 시험성적 계산기 만들기
public class back05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a>=90)?'A':(a>=80)?'B':(a>=70)?'C':(a>=60)?'D':'F');
    }
}
