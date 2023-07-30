package Nks;

public class Ex_1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = 2000+age;
        age += 1;

        System.out.println(year);  // 2014 = 2000 + age(14)
        System.out.println(age);   // 15 = age(14) + 1
    }
}
