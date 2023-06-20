import java.util.Scanner;

public class Leson12_Bai2 {
    //+ Tìm số lớn nhất trong 3 số
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int number1= Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào số thứ hai: ");
        int number2= Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào số thứ ba: ");
        int number3= Integer.parseInt(input.nextLine());

        if(number1>number2){
            if(number1>number3){
                System.out.println("Số max là: "+number1);
            } else {
                System.out.println("Số max là: "+number3);
            }
        } else {
            if(number2>number3){
                System.out.println("Số max là: "+number2);
            }else {
                System.out.println("Số max là: "+number3);
            }
        }
    }
}
