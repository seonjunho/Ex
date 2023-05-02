package C_ex;

public class C8_17 {
    public static void main(String[] args) {
        int i,j;
        int[][] gugu = new int[9][9];

        for(j = 0; j < 9; j++){
            for(i = 0; i < 8; i++){
                gugu[i][j] = (j+1)*(i+2);
            }
        }
        for(j = 0 ; j < 9; j++){
            for(i = 0 ; i < 8; i++){
                System.out.printf("%d X %d = %2d \t",i+2,j+1,gugu[i][j]);
            }
            System.out.println();
        }
    }
}
