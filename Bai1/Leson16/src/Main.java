import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner inputNumber = new Scanner(System.in);
//        checkNumber(inputNumber);
//
//    }
//    public static void checkNumber(Scanner inputNumber){
//        boolean isValid = false;
//        while (!isValid) {
//            System.out.print("Nhập vào một số nguyên: ");
//            String input = inputNumber.nextLine();
//
//            try {
//                int number = Integer.parseInt(input);
//                isValid = true;
//            } catch (NumberFormatException e) {
//                System.out.println("Lỗi: Bạn nhập không phải là số nguyên. Vui lòng nhập lại!");
//            }
//        }
//    }

        public static void Check0To9 (){
            Scanner inputNumber = new Scanner(System.in);
            int input = inputNumber.nextInt();
            while (input > 0 || input < 10) {
                System.out.println("Số vừa nhập là: " + input);
            }
        }
        Check0To9 ();

    }
}