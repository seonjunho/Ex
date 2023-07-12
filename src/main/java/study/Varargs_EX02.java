package study;

import java.util.Scanner;
// 가변인자: 갯수가 정해져있지 않은 인자. , 호출용 인수:아규먼트
public class Varargs_EX02 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println(i + 1 + "숫자를 입력하세요 : ");
            num[i] = sc.nextInt();
        }

        System.out.println("총합 : "+ sum(num[0], num[1], num[2], num[3], num[4]));
    }

    static int sum(int num1,int num2,int num3,int num4,int num5){
        return num1 + num2 + num3 + num4 + num5;
    }
    //https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=justkukaro&logNo=220710646041
    //https://madnix.tistory.com/entry/%EC%95%84%EA%B7%9C%EB%A8%BC%ED%8A%B8argument-%EC%99%80-%ED%8C%8C%EB%9D%BC%EB%AF%B8%ED%84%B0parameter-%EC%9D%98-%EC%B0%A8%EC%9D%B4
}
