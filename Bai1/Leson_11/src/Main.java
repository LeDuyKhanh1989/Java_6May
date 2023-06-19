import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int numberA = input.nextInt();
        System.out.println("Nhập vào số b: ");
        int numberB = input.nextInt();
        int sumAB = 0;
        if (numberA > numberB) {
            for (int i = numberB; i <= numberA; i++) {
                sumAB += i * i;
            }
        } else {
            for (int i = numberA; i <= numberB; i++) {
                sumAB += i * i;
            }

            System.out.println("Tổng bình phương các số từ a đến b là: " + sumAB);
        }
    }
}