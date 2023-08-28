package study;

public class C_quiz22_02_6 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        for(i = 0 ; i <= 10 ; i++){
            if(i % 2 != 0)
                continue;
            sum += i;
        }
        System.out.printf("%d",i + sum);
    }
}

// 0~10 까지의 짝수의 합 구하기.
// if 에서 홀수일 경우 continue 로 건더 뜀
// ** i <= 10 ** 이므로 11에서 i가 종료됨 그러므로 i의 최종 값은 11
