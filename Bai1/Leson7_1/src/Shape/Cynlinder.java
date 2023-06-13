package Shape;

public class Cynlinder extends Circle implements Comparable{

    private int heigh;

    public Cynlinder(int radius, int heigh) {
        super(radius);
        this.heigh = heigh;
    }

    @Override
    public void compareTo(Circle obj) {
        int a= this.getRadius();
        if(a> obj.getRadius()){
            System.out.println("This shape has biger radius");
        } else
        System.out.println("This shape has smaller radius");
    }

}
