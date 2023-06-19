import java.util.Scanner;

public class Bai3 {
    //+ Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int numberA = input.nextInt();
        System.out.println("Nhập vào số b: ");
        int numberB = input.nextInt();
        System.out.println("Ước chung lớn nhất của 2 số "+numberA+" & "+numberB+" :   "+findUCLN(numberA,numberB));
    }
    public static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
