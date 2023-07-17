package NKs7;

public class Ex07_2 {
    public static void main(String[] args) {
        Childz c = new Childz();
        c.method();
    }
}

class Parentz { int x = 10; }

class Childz extends Parentz{
    int x = 20;

    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

// public class Ex07_2_1{
// public static void main(String[] args){
// Childz2 c = new Childz2();
// c.method();
// }
//}
//
//class Parentz2 { int x = 10; }
//class Childz2 extends Parentz2 {
//  void method(){
//   System.out.println("x=" + x);
//   System.out.println("this.x=" + this.x);
//   System.out.println("super.x=" + super.x);
// 결과 = x= 10 / this.x = 10 / super.x = 10