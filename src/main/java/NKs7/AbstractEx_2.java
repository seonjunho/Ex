package NKs7;
abstract class unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){};
}
class Marin extends unit{
    int x,y;
    void move(int x, int y){
        System.out.println("["+x+","+y+"]로 이동");
    }
    void stop(){
        System.out.println("멈춤");
    }
}
class Tank extends unit{
    int x,y;
    void move(int x ,int y){
        System.out.println("["+x+","+y+"]로 이동");
    }
    void stop(){
        System.out.println("멈춤");
    }
}
public class AbstractEx_2 {
    public static void main(String[] args) {
        unit[] group = {new Tank(),new Marin()};
        group[1] = new Tank();
        group[0] = new Marin();
        Marin marin = new Marin();
        Tank tank = new Tank();

        marin.move(100,200);
        marin.stop();
        tank.move(500,200);
        tank.stop();

        for(int i = 0 ; i < group.length; i++){
            group[i].move(300,200);
            System.out.println();
        }


    }
}
