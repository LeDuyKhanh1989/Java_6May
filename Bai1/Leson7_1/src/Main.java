import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Chicken C1 = new Chicken();
        System.out.println(C1.howToEat());
        System.out.println(C1.makeSound());
        Tiger tiger1 = new Tiger();
        System.out.println(tiger1.makeSound());

        System.out.println("============================Fruit");
        Orange O1 = new Orange();
        System.out.println(O1.howToEat());
    }
}
