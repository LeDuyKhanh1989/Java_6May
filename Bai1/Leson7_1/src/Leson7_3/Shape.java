package Leson7_3;

public class Shape {
    private String color;
    private int ID;
    static int countID=0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCountID() {
        return countID;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
}
