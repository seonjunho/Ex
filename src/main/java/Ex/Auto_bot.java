package Ex;

import java.awt.*;

public class Auto_bot {
    public static void main(String[] args) throws Exception {

        Robot bot= new Robot();

        int x,y;

        while (true){
            x = (int) (Math.random() * 1600);
            y = (int) (Math.random() * 900);

            bot.mouseMove(x, y);

            Thread.sleep(100000);
        }
    }
}
