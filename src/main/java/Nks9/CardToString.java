package Nks9;
class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        if (c1 == c2)
            System.out.println("c1과 c2는 서로 같습니다.");
        else
            System.out.println("c1과 c2는 서로 다릅니다.");

        c1 = c2;

        if (c1 == c2)
            System.out.println("c1과 c2는 서로 같습니다.");
        else
            System.out.println("c1과 c2는 서로 다릅니다.");
    }

}
