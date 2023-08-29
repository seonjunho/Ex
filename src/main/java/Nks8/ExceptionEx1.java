package Nks8;

public class ExceptionEx1 {
    public static void main(String[] args) {
//        System.out.println(1);
//        try{
//            System.out.println(2);
//            System.out.println(3);
//        }catch (Exception e){
//            System.out.println(4);
//        }
//        System.out.println(5);
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2);
        }catch(ArithmeticException ae){
            System.out.println(3);
        }
        System.out.println(4);
    }
}
