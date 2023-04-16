package Nks;
//유니코드 이해
public class Ex2_07 {
    public static void main(String[] args){
        char ch = 'A'; // char ch = 65;
        int code = (int)ch; //ch에 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#x) \n",ch, code, code);

        char hch = '가';   // char hch = 0xAC00;
        System.out.printf("%c=%d(%#x)", hch, (int)hch, (int)hch);
    }
}
