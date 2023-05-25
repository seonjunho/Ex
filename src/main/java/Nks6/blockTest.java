package Nks6;

class blockTest {
    static{
        System.out.println("static { }");
    }

    {
        System.out.println(" ( ) ");
    }
    public blockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest () ;");
        blockTest bk = new blockTest();

        System.out.println("BlockTest bt2 = new BlockTest () ;");
        blockTest bk2 = new blockTest();
    }
}
