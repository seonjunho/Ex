package If;

import java.util.*;

public class reconing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String c ="";

        for (; ;){
            System.out.print("계산 할 수를 입력하세요 : ");
            a = sc.nextInt();
            System.out.print("계산 할 수를 입력하세요 : ");
            b = sc.nextInt();
            System.out.print("연산자를 입력하세요 : ");
            c = sc.next();
            if(c.equals("+")){
                System.out.println(a+"+"+b+"="+(a+b));
            }else if(c.equals("-")){
                System.out.println(a+"-"+b+"="+(a-b));
            }else if(c.equals("*")){
                System.out.println(a+"*"+b+"="+(a*b));
            }else if(c.equals("/")){
                System.out.println(a+"/"+b+"="+(a/(float)b));
            }else if(c.equals("%")){
                System.out.println(a+"%"+b+"="+(a%b));
            }
        }
    }
}
