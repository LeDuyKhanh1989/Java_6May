import java.util.Scanner;

public class Linh_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nam: ");
        int number1= Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào số nữ: ");
        int number2= Integer.parseInt(input.nextLine());
        if(number1<number2){
            System.out.println("Số cặp đôi là "+number1 );
            System.out.println("Số cặp đồng giới là " +((int)(number2-number1)/2));
        } else {
            System.out.println("Số cặp đôi là "+number2 );
            System.out.println("Số cặp đồng giới là " +((int)(number1-number2)/2));
        }
    }
}
