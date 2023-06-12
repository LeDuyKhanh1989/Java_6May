package Circle;

public class Circle {
    private int id;
    private double radius;
    private static int variableIncreasement=100001;
    public final double PI=3.14;
    private static double maxRadius;
    public static double sumS;
    public Circle(double radius) {
       this.id=variableIncreasement;
        this.radius = radius;
        variableIncreasement++;
        if(radius>maxRadius){
            maxRadius=radius;
        }
        sumS+=getS();
    }
    public static double getM(){
        return maxRadius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public double getS(){
        double S= this.radius*this.radius*this.PI;
        return S;
    }
    public double getC(){
        double C=2*this.radius*this.PI;
        return C;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
