package Nks6;
class MethodTest1{
    void display1(){
        System.out.println("display1() 메서드호출 >>");
        int tot = 0;
        for(int i = 1; i <= 100 ; i++) tot += i;
        System.out.println("1~100 범위의 정수 합계 " + tot);
    }
    void display2(int num){
        System.out.println("display2() 메서드 호출 >>");
        if(num <= 0){
            System.out.println("[에러메시지]입력값은 0보다 큰 정수여야 합니다.");
            return;
        }
        int  tot = 0;
        for(int i = 1; i <= num ; i++) tot += 1;
        System.out.println("1~"+ " 범위의 정수 합계 " + tot);
    }
    void display3(int start, int end){
        System.out.println("display3() 메서드 호출 >>");
        if(start > end){
            System.out.println("[경고]시작값이 끝 값보다 크면 안됨...");
            return;
        }
        int tot = 0;
        for(int i = start; i <= end; i++) tot += i;
        System.out.println(start + "~" + end + " 범위의 정수 합계 " + tot);
    }

    int returnTot(int start, int end){
        System.out.println("returnTot() 메서드 호출");
        if(start > end){
            System.out.println("[경고]시작값이 끝 값보다 크면 안됨...");
        }
        int tot = 0 ;
        for(int i = start ; i <= end ; i++) tot += i;
        return tot;
    }
    boolean isOddEven(int num){
        if(num % 2 == 0)return true;
        else return false;
    }
    String addString(String str1, String str2){
        return str1 + " & " + str2;
    }
    int[] returnArray(int num){
        int[] array = new int[num];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = ( i + 1 ) * 10;
        }
        return array;
    }
}
public class MethodTest {
    public static void main(String[] args) {
        MethodTest1 mt = new MethodTest1();

        mt.display1();
        mt.display1();

        mt.display2(-1);
        mt.display2(90);

        mt.display3(20, 60);
        mt.display3(60, 20);

        int tot = mt.returnTot(20,60);
        System.out.println("합계 =" + tot);
        System.out.println("합계 =" + mt.returnTot(20, 60));

        if(mt.isOddEven(10)){
            System.out.println("입력값 >> 짝수");
        }
        else{
            System.out.println("입력값 >> 홀수");
        }
        System.out.println(mt.addString("JAVA", "JSP"));

        int[] age = mt.returnArray(5);
        for(int nai:age){
            System.out.print(nai+ " ");
        }
        System.out.println();
    }
}
