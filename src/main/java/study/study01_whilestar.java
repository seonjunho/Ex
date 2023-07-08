package study;

public class study01_whilestar {
    public static void main(String[] args) {

        int i, j;
        for (i = 0; i < 5; i++){
            j = 0;
            while (j < i+1){
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }
    }
}
