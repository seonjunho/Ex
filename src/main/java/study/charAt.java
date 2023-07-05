package study;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int strLeng = str.length();

        for(int i = 0; i < strLeng-1; i++){
            if(str.charAt(i) != str.charAt(strLeng-i-1)){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);


//        char c1 = ' ';
//        char c2 = ' ';
//
//        c1 = sc.next().charAt(0);
//        c2 = sc.nextLine().charAt(3);
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        sc.close();
        //https://colossus-java-practice.tistory.com/31
    }
}
