package Nks6;
class phones{
    private String color;
    private int serialcode;
    boolean power;

    void Power(){ power = !power;}
    phones(String color, int serialcode){
        this.color = color;
        this.serialcode = serialcode;
    }
    public String getcolor(){
        return this.color;
    }
    public int getSerialcode(){
        return this.serialcode;
    }
}
public class phone {
    public static void main(String[] args) {
        phones p = new phones("빨강",125-777-5879);
        System.out.println("기종의 색상은:"+p.getcolor()+"이며, 시리얼 넘버는:"+p.getSerialcode()
        +"입니다.");
    }
}
