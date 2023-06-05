package Nks6;

class Product {
    static int count = 0;         // 클래스변수 count 0으로 초기화
    int serialNo;
    {
        ++count;                  //클래스 변수 0에서 ++로 복잡초기화
        serialNo = count;
    }

    public Product() {} //메서드 생성
}

class ProductTest{
    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial No)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial No)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial No)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
    }
}
