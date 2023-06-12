package Shape;

public class Circle extends Shape {
    private double radius=0.1;

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(int radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPrimerter(){
        return this.radius*2*Math.PI;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=xxx, which is a subclass of yyy";
    }
}
