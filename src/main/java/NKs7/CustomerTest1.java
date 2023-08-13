package NKs7;
class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        initCustomer();
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public String getcustomerName(){
        return customerName;
    }

    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showcustomerInfo() {
        return customerName + "님의 등급은" + customerGrade + "이고, 포인트는"
                + bonusPoint + "점 입니다.";
    }
}
class VIPCustomer extends Customer {

    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){

        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
    public String showCustomerInfo(){
        return super.showcustomerInfo() + "담당 상담원 번호는 "+ agentID +"입니다.";
    }
    public int getAgentID(){
        return agentID;
    }
}
public class CustomerTest1 {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10200, "이은정");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showcustomerInfo());

        Customer customerChoi = new VIPCustomer(10201, "최민식", 100);
        customerChoi.bonusPoint = 1000;
        System.out.println(customerChoi.showcustomerInfo());
        System.out.println("===== 할인율과 보너스 포인트 계산 =====");

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int choiPrice = customerChoi.calcPrice(price);

        System.out.println(customerLee.getcustomerName() + "님이" +
                leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showcustomerInfo());
        System.out.println(customerChoi.getcustomerName() + "님이" +
                choiPrice + "원 지불하셨습니다.");
        System.out.println(customerChoi.showcustomerInfo());
    }
}
