package study;

import java.util.Arrays;

public class Varargs_EX01 {
    public static void main(String[] args) {
        Book12 book1 = new Book12();
        book1.title = "자바 , 문법";
        book1.author = "It Cook Book";
        book1.setTag("컴퓨터", "IT", "프로그램 언어","자바");

        Book12.printInfo(book1);

        Book12 book2 = new Book12();
        book2.title = "C";
        book2.author= "It Cook Book";
        book2.setTag("IT", "프로그램 언어");

        Book12.printInfo(book2);
    }
}

class Book12 {
    String title;
    String author;
    String[] tag;

    void setTag(String... params) { //String... (가변인자명)
        tag = new String[params.length];
        for (int i = 0; i < tag.length; i++) {
            tag[i] = params[i];
        }
    }

    static void printInfo(Book12 book){
        System.out.printf("제목: %s%n 저자: %s%n",book.title, book.author);
        System.out.printf("카테고리: %s%n", Arrays.toString(book.tag));
    }
}
