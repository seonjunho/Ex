package org.example;

public class Basic {
    public static void main(String[] args) {
        int tex = 8000;
        int tex2 = 10000;
        int tex3 = 5000;
        String menu ="돈까스 x 16";
        String menu2 ="칼국수 x 8";
        String menu3 ="왕만두 x 1";

        System.out.printf("%s = %d\n",menu,tex*16);
        System.out.printf("%s = %d\n",menu2,tex2*8);
        System.out.printf("%s = %d\n",menu3,tex3);
        System.out.printf("=========================\n");
        int sum = (tex * 16) + (tex2 * 8) + tex3;
        System.out.printf("total: %d",sum);

    }
}
