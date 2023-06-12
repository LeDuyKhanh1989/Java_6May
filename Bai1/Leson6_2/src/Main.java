import Point2D.Point2D;

import java.util.Arrays;
import Point2D.Point3D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point2D newPoint = new Point2D(3,4);
        System.out.println(Arrays.toString(newPoint.getXY()));
        System.out.println("======================");
        Point3D diemxyz1= new Point3D(4,6,5);
        System.out.println(diemxyz1.toString());
        System.out.println(Arrays.toString(diemxyz1.getXYZ()));

    }
}