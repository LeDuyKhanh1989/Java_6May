import java.util.Scanner;

public class Bai4 {
    //+ Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào số a: ");
            int numberA = input.nextInt();
            System.out.println("Nhập vào số b: ");
            int numberB = input.nextInt();
            int BCNN=0;

            BCNN=numberA*numberB/findUCLN(numberA,numberB);
        System.out.println("Bội chung lớn nhất của 2 số: "+numberA + " & "+numberB+":   "+ BCNN);
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