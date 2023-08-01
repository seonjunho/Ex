package NKs7;

abstract class myShape {
    protected int x, y, width, heigth;

    public void setX(int newX){
        x = newX;
    }
    public void setY(int newY){
        y = newY;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setHeigth(int newHeigth){
        heigth = newHeigth;
    }
    public abstract float getArea();
}

public class absShape extends myShape{
    int heigth = 10;
    int width = 20;

    @Override
    public float getArea() {
        System.out.println("넓이 값 "+width * heigth);
        return width * heigth;
    }

    public static void main(String[] args) {
        absShape ractangle = new absShape();

        ractangle.getArea();
    }
}
