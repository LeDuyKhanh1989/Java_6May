package Shape;

public class Rectangle extends Shape{
   private double width=0.1;
   private double heigh=0.1;
    public Rectangle(){

    }
    public Rectangle(double width, double heigh){
        this.heigh=heigh;
        this.width=width;
    }
    public Rectangle(double width){
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getPrimerter(){
        return (this.heigh+this.heigh)*2;
    }
    public double getArea(){
        return this.width*this.heigh;
    }

    @Override
    public String toString() {
        return  "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy";
    }
}
