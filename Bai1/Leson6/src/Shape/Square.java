package Shape;

public class Square extends Rectangle{
    public Square() {
        super();
        setHeigh(getWidth());
    }

    public Square(double width) {
        super(width);

    }

    public Square(double width, double heigh) {
        double a=width;
        heigh=a;

    }

    @Override
    public String toString() {
        return  "A Square with side=xxx, which is a subclass of yyy";
    }
}
