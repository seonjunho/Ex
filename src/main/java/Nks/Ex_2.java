package Nks;

public class Ex_2 {
    public static void main(String[] args) {
        int x = 10 , y = 20;
        int tmp ;
        System.out.println("x :"+ x +" y :"+ y);

        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x :"+ x +" y :"+ y);
    }
}
