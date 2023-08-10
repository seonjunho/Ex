package study;

public class C_Quizz22_03_8 {
    public static void main(String[] args) {
        int i = 1, n = 0;
        while (i <= 50) {
            if(i%7 ==0){
                n += i;
            }
            i++;
        }
        System.out.printf("%d",n);
    }
}

//        int n = 0;
//        for (int i = 1; i <= 50; i++) {
//            if(i%7 == 0){
//                n += i;
//            }
//        }
//        System.out.printf("%d",n);
//    }
//}

// 50과 같아질때까지 반복하며 7로 나누어 떨어지는 수를 따로 구해서 n에다 합산한다.
// 답:196