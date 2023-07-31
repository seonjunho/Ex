package NKs7;
abstract class mCalculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}
public class abst_Calculator extends mCalculator {
        public int add ( int a, int b){
            return a + b;
        }
        public int subtract (int a, int b) {
            return a - b;
        }
        public double average(int [] a){
            double sum = 0 ;
            for (int i = 0 ; i < a.length; i++)
                sum += a[i];
            return sum/a.length;
        }

    public static void main(String[] args) {
        abst_Calculator ab = new abst_Calculator();
        System.out.println(ab.add(2,3));
        System.out.println(ab.subtract(2,3));
        System.out.println(ab.average(new int[] {2,3,4}));
    }
}