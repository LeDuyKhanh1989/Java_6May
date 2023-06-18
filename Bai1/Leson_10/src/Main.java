import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Mylist> element= new ArrayList<>();
        Mylist obj1= new Mylist<>(5,12);
        Mylist obj2= new Mylist<>(6,14);
        Mylist obj3= new Mylist<>(7,16);
        element.add(obj1);
        element.add(obj2);
        element.add(obj3);
        for (int i=0;i<element.size();i++){
            System.out.print("Obj "+i+" Getdefault Capacity "+element.get(i).getDefault_capacity());
            System.out.println(" Side "+element.get(i).getSize());
        }

    }
}