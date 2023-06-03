package study;

import java.util.Scanner;

public class bj14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.printf("1");
            } else {
                System.out.printf("4");
            }
        }
            else {
        }

            if (y > 0) {
                System.out.printf("2");
            } else {
                System.out.printf("3");
            }
        }
    }
