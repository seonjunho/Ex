import java.util.Scanner;

public class back5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // 5개의 값을 받기 위한 스캐너 사용
        int arr[] = new int[5];                 // 5개의 값을 저장하기 위한 배열 사용

        System.out.println("값을 입력: ");        // 초기 입력값을 위한 출력문 사용
        for(int i = 0; i < arr.length; i++){    //  값을 받기위한 반복문 사용
            arr[i] = sc.nextInt();              // 위 반복문에서 받은 값이 저장됨
        }
        for(int i = 0; i < arr.length; i++){       // 저장된 값을 비교하기 위한 반복문 사용
            for(int j = 0; j < arr.length; j++){   // 위 저장값과 비교할 공간을 확보하기 위한 다른 반복문 사용
                if(arr[i] > arr[j]){               // 앞수와 뒷수를 비교한다.
                    int tmp = arr[j];              // arr[j] 값을 tmp에 저장한다.
                    arr[j] = arr[i];               // arr[i] 값을 arr[j]에 저장한다.
                    arr[i] = tmp;                  // tmp값을 arr[i]에 저장한다.
                }
            }
        }
        System.out.print("출력 값:");               // 결과 값을 알리기위한 출력문 사용
        for(int i = 0; i < arr.length;i++){        // 비교값이 저장된 arr[i]를 출력하기 위한 반복문 사용
            System.out.print(arr[i]+" ");          // 출력 결과 가독성을 위해 출력문에 여백(" ")을 추가
        }
    }
}
