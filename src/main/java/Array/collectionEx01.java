package Array;

import java.util.*;
public class collectionEx01 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(); // 정렬을 위한 링크드 리스트 사용
        Scanner sc = new Scanner(System.in);           // 값을 받기 위한 스캐너 사용

        for (int i = 0; i < 5; i++){       // 5개의 값을 받기위한 반복문 사용
            System.out.print("입력 : ");    // 값을 받기 위한 안내용 출력문 설정
            int num = sc.nextInt();        // 스캐너로 정수의 값을 받아 저장
            list.add(num);                 // 위에서 받은 정수값을 리스트화 한다.
        }
        Collections.sort(list, Collections.reverseOrder()); // 컬렉션소트로 오름차순을 진행후 뒤 리버스로 다시 뒤집어 내림차순으로 변경

        System.out.print("출력 : ");        // 최종 값 출력을위한 출력문 사용
        for (int num : list){              // 위 저장한 리스트 값 출력을 위한 반복문사용
            System.out.print(num + ",");   // 최종 출력 값을 위한 출력문 사용
        }
    }
}