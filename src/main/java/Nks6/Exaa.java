package Nks6;
class Bank{
    private String Name;
    private double Balance;
    private static double Rate;
    public Bank(String Name, double Balance, double Rate){
        super();
        this.Name = Name;
        this.Balance = Balance;
        this.Rate = Rate;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    public static double getRate(){
        return Rate;
    }
    public static void setRate(double Rate){
        Bank.Rate = Rate;
    }
    public void print_account(){
        System.out.println(Name + "\t"+ Balance + "원\t" + Rate + "%");
    }
}
public class Exaa {
    public static void main(String[] args) {
        System.out.println("2020년");
        Bank lee = new Bank("이수혁",10000,2.0);
        Bank.setRate(2.0);
        lee.print_account();

        System.out.println("2021년");
        Bank park = new Bank("박윤지",20000,2.5);
        Bank.setRate(3.0);
        lee.print_account();
        park.print_account();

        System.out.println("2022년");
        Bank kim = new Bank("김유현",25000,4.0);
        Bank.setRate(4.5);
        lee.print_account();
        park.print_account();
        kim.print_account();
    }
}

// https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=editinside&logNo=220738433238