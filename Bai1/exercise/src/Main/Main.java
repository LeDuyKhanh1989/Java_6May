package Main;

import Circle.Circle;

import static Circle.Circle.sumS;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(200);
        Circle circle2 = new Circle(300);
        Circle circle3 = new Circle(400);
        System.out.println("==================================== Circle class");
        System.out.println(circle1.getId());
        System.out.println(circle1.getS());
        System.out.println(circle1.getRadius());
        System.out.println("==================");
        System.out.println(circle2.getId());
        System.out.println(circle2.getS());
        System.out.println(circle2.getRadius());
        System.out.println("================== Max radius: ");
        System.out.println(Circle.getM());
        System.out.println("================== Sum S: ");
        System.out.println(sumS);
    }
}
