import java.util.Scanner;

public class Leson12_3 {
    //+ Nhập vào 3 cạnh tam giác, cho biết loại của tam giác đó
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất cảu tam giác: ");
        double number1 = Double.parseDouble(input.nextLine());
        System.out.println("Nhập vào cạnh thứ hai cảu tam giác: ");
        double number2 = Double.parseDouble(input.nextLine());
        System.out.println("Nhập vào cạnh thứ ba cảu tam giác: ");
        double number3 = Double.parseDouble(input.nextLine());
        checkHTG(number1, number2, number3);

    }

    public static void checkHTG(double a, double b, double c) {
        if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a)) {
            System.out.println("Đây là tam giác vuông");
        } else if (a == b & b == c) {
            System.out.println("Đây là tam giác đều");
        } else if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a) & (a == b || b == c ||a==c)) {
            System.out.println("Đây là tam vuông cân");
        } else {
            System.out.println("Đây là tam giác thường");
        }
    }
}