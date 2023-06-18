import Animal.Animal;

import java.sql.SQLOutput;
import java.util.Arrays;

import Animal.Cat;
import Animal.Dog;
import Animal.Bird;
import Animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] arr = new Animal[10];
        System.out.println("Add a Animal");
        Animal undefined = new Animal();
        arr[0]= undefined;
        System.out.println(undefined.makeSound());
        System.out.println("Check undefined in Cat class");
        Cat cat2=new Cat("red",true,"Meo Vàng");
        arr[1]=cat2;
        Dog dog1=new Dog();
        arr[2]=dog1;
        Cat cat1 = new Cat();
        arr[3]=cat1;
        cat1.setHealth(true);
        cat1.setEyeColor("Green");
        cat1.setCatType("Python");
        System.out.println("Check the Object is being in Cat class or not");
        System.out.println(undefined instanceof Cat);
        System.out.println(cat1);
        System.out.println("Số thú trong sở thú là: "+(Animal.increaseID-1000));

    }
}