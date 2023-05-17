package study;

public class while_gugudan {
    public static void main(String[] args) {
        int i,j;
        for(i=2;i<10;i++){
            j=1;
            while(j<10){
                System.out.printf("%d X %d = %d\t", i,j, i*j);
                j++;
            }
            System.out.printf("\n");
        }
    }
}
