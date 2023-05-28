package Ex;
// 배열 활용하여 요소 순서 섞기
import java.util.Arrays;

public class s_class03 {
    public static void main(String[] args){
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i< 100; i++){
            int n = (int)(Math.random() * 100); // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[i];   //  1.tmp라는 빈컵에 커피가 들어있는 Arr[0] 을 옮긴다.
            numArr[i] = numArr[n]; //  2.Arr[0]의 빈컵(기존커피)에 Arr[n] 우유 를 옮긴다.
            numArr[n] = tmp;       //  3.커피가있는 tmp 컵을 우유를 옮기고 빈 컵인 Arr[n]컵에 옮긴다.
        }                          //   numArr[0]과 numArr[n]의 값을 서로 바꾼다.
        System.out.println(Arrays.toString(numArr));
    }// main 끝
}// clss 끝
