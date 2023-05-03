package Array;
import java.util.*;
public class collectionQuiz2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set <Integer> set = new HashSet<>(); // 셋은 중복을 허용하지 않는다. 그러므로 셋을 사용한다.
        int[] arr = new int[5]; //5개의 값을 저장하기 위한 배열 사용

        System.out.println("저장된 값 :");      // 초기 저장값을 받을 출력문 사용
        for(int i = 0 ; i < arr.length; i++){ // 배열의 길이만큼 수를 받을 반복문 사용
            int a = s.nextInt();              // 값을 입력받기 위한 정수타입의 변수 a 사용
            arr[i] = a;                       // 5개의 배열에 위에서 입력된 값을 대입한다.
            set.add(a);                       // a의 입력받은 중복값을 방지하기 위한 set을 사용
        }
        System.out.print("저장된 값 : ");        // 최종 저장 값을 알려줄 출력문 사용
        for(int num : set){                    // set값을 출력하기 위한 반복문 사용
            System.out.printf(num + " ");      // 위 출력문과 결합하여 출력하기 위한 최종 출력문
        }
    }
}
