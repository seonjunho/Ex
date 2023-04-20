package org.example;

public class Ex_004 {
    public static void main(String[] args) {
        int i = 2, j = 1;
        while (i<=9){
            System.out.print(i+"X"+j+"="+i*j+"\n");
            j++;
            if(j == 9){
              i++;
              j = 1;
            }

        }

    }
}
