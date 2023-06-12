import Shape.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Square square1=new Square(100,200);
        System.out.println(square1.toString());
        System.out.println(square1.getArea());
        square1.setHeigh(100);
        System.out.println(square1.getWidth()+" "+ square1.getHeigh());

    }


}