// 두 정수 A와 B를 입력받은 다음,A+B를 출력하는 프로그램을 작성하시오.
// 출력 : 각 테스트 케이스 마다 A+B를 출력한다.
// 예제 입력 1 : 5  1 1 2 3 3 4 9 8 5 2 예제 출력 1 : 2 5 7 17 7
package Ex;
import java.util.Scanner;
public class back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }

    }
}
