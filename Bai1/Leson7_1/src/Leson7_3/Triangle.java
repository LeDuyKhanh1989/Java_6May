package Leson7_3;

public class Triangle extends Shape implements ResizeShape{
    private int side;
    private double heigh;

    public Triangle() {
    }

    public Triangle(int side, double heigh) {
        this.side = side;
        this.heigh = heigh;
    }

    public Triangle(String color, int side, double heigh) {
        super(color);
        this.side = side;
        this.heigh = heigh;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    @Override
    public double resize(double percent) {
        return side * percent;
    }
}
