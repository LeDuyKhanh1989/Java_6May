import Animal.Cat;
import Animal.ManageCat;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat Tom = new Cat("Blue & White", "Blue");
        ManageCat arrCat= new ManageCat();
        Cat Tom2 = new Cat("Yellow", "Pink");
        Cat Tom3 = new Cat("Red & Yellow", "Magenta");
        arrCat.add(Tom);
        arrCat.add(Tom2);
        arrCat.add(Tom3);
        for (int i=0; i< arrCat.arr.length; i++){
            System.out.println(arrCat.arr[i]);
        }
        arrCat.edit(Tom);
        for (int i=0; i< arrCat.arr.length; i++) {
            System.out.println(arrCat.arr[i]);
        }
    }
}