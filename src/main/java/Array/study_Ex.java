package Array;
//중간고사 문제
import java.util.Scanner;
public class study_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(max > arr[i]){
                    max = arr[i];
                }if(min < arr[i]){
                    min = arr[i];
                }
            }
        }
        double averarge = (double)sum/arr.length;
        System.out.printf("최대 값:"+max+"최소 값:"+min+"평균 값:"+averarge+"총 값 :"+sum);
    }
}
