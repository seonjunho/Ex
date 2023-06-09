package Nks6;

class quick_board {
    String color;
    String geartype;
    int speed;

    quick_board() {
        this("white", "auto", 25);
    }

    quick_board(quick_board Q) {
        color = Q.color;
        geartype = Q.geartype;
        speed = Q.speed;
    }

    quick_board(String color, String geartype, int speed) {
        this.color = color;
        this.geartype = geartype;
        this.speed = speed;
    }
}

class quick_boardT {
    public static void main(String[] args) {
        quick_board Q = new quick_board();
        quick_board Q2 = new quick_board();

        System.out.println("Q의 color = " + Q.color + ", geartype = " + Q.geartype + ", speed = " + Q.speed);
        System.out.println("Q2의 color = " + Q2.color + ", geartype = " + Q2.geartype + ", speed = " + Q2.speed);

        Q.speed = 40;
        Q.color = "black";
        System.out.println("Q의 개조 수행 후");
        System.out.println("Q의 color = " + Q.color + ", geartype = " + Q.geartype + ", speed = " + Q.speed);
        System.out.println("Q의 color = " + Q2.color + ", geartype = " + Q2.geartype + ", speed = " + Q2.speed);

    }
}
