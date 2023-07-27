package NKs7;
abstract class Player{
    abstract void play(int pos);
    abstract void stop();
}
class audioPlayer extends Player{
void play(int pos){
    System.out.println(pos+"위치로 부터 play 합니다.");
}
void stop(){
    System.out.println("재생을 멈춥니다.");
}
}
public class PlayerTest {
    public static void main(String[] args) {
        Player p = new audioPlayer();
        p.play(90);
        p.stop();
    }
}
