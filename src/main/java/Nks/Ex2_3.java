package Nks;

import java.sql.SQLOutput;

public class Ex2_3 {
    public static void main(String[] args){
        String name= "ja" + "va"; //char 타입은 문자열 한개만 저장할 수 있음
        String str= name + 8.0; // String은 원래 클래스다. 원래는 new를 사용해야 하지만 특별히 일반 정수처럼 선언 가능하다.

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 +"");
        System.out.println(""+ 7);
        System.out.println("" + ""); //
        System.out.println(7 + 7 + ""); // +연산자는 왼쪽에서 우측으로 계산해 나아간다.
        System.out.println("" + 7 + 7); // ""는 숫자를 문자화한다.
        System.out.println(7 + "7"); // 7이 String이 아니므로 문자로 변환하여 77이라는 값이 나오게된다.
    }
}
