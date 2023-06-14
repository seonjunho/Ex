package NKs7;

class Book {
    public String name;
    public String publisher;
    Book(){
        this.name="";
        this.publisher="";
    }
    Book(String name,String publisher){
        this.name=name;
        this.publisher=publisher;
    }
    void print(){
        System.out.println("print : Book");
    }
}
class Novel extends Book{
    public String name;
    public String publicher;
    Novel(String name,String publicher){
        super(name,publicher);
    }
    @Override
    void print(){
        System.out.println("print : Novel");
    }
}
class SF extends Book{
    public String name;
    public String publicher;
    SF(String name,String publicher){
        super(name,publicher);
    }
    @Override
    void print(){
        System.out.println("print : SF");
    }
}
class Books{
    public static void main(String[] args) {
        Book b = new Novel("코딩하자 코딩","방구석 코더");
        Book c = new SF("강아지에 대하여","보름");

        System.out.println("책의 이름은"+b.name+",이며 광고주는 "+b.publisher+" 이다.");
        System.out.println("책의 이름은"+c.name+",이며 광고주는 "+c.publisher+" 이다.");

    }
}