package study;

public class Dowhile {
    public static void main(String[] args) {
        int i = 2,j = 1;
        while (true){
            System.out.printf("%d X %d = %d\t",i,j,i*j);
            i++;
            if(i == 10) {
                j++;
                i = 2;
                System.out.println();
            }
                if(j == 10){
                    break;
                }
            }
        }
    }