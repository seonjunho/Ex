package NKs7;
class DrawShape {
    public static void main(String[] args) {
        Points[] p = {new Points(100, 200),
                new Points(140, 50),
                new Points(200, 100)
        };

        Triangles t = new Triangles(p);
        Circle c = new Circle(new Points(150, 150), 50);

        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]/n",color);
    }
}

class Points {
    int x;
    int y;
    Points(int x, int y){
        this.x = x;
        this.y = y;
    }
    Points(){
        this(0,0);
    }
    String getXY(){
        return "("+x+","+y+")";
    }
}

class Circle extends Shape {
    Points center;
    int r;
    Circle(){
        this(new Points(0,0),100);
    }
    Circle(Points center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangles extends Shape{
    Points[] p = new Points[3];

    Triangles(Points[] p){
        this.p = p;
    }

    void draw(){
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
                p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
    }
}