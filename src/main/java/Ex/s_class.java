package Ex;
// 배열 평점 구하기
public class s_class {
    public static void main(String[] args) {
        int sum = 0;           //총합을 저장하기 위한 변수
        float average = 0f;    //평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0;i < score.length;i++){
            sum += score[i]; // 반복문을 이용해서 배열에 저장된 값을 모두 더한다.
        }
        average = sum / (float)score.length; // 계산결과를 float타입으로 얻으려 형변환

        System.out.println("총합 : "+ sum);
        System.out.println("평균 : "+ average);
    }

}
