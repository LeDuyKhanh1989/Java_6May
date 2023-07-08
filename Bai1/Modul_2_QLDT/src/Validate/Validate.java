package Validate;

import java.util.Scanner;

public class Validate {
    public String validateDate() {
        Scanner input = new Scanner(System.in);
        String output;
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
                "^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1" +
                "-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        boolean checkDate = false;
        do {
            String checkDateStr = input.nextLine();
            output = checkDateStr;
            checkDate = checkDateStr.matches(regex);
            if (!checkDate) {
                System.out.println("Bạn nhập sai định dạng, yêu cầu nhập theo dd/mm/yyyy:");
            }
        } while (!checkDate);
        return output;
    }
    public int validateNumber(){
        Scanner input = new Scanner(System.in);
        String output;
        String regex = "^[0-9]+$";
        boolean checkNumber = false;
        do {
            String number = input.nextLine();
            output = number;
            checkNumber = number.matches(regex);
            if (!checkNumber) {
                System.out.println("Bạn nhập sai định dạng số, yêu cầu nhập theo định dạng từ 0-9");

            }
        } while (!checkNumber);
        return Integer.parseInt(output);
    }
    public String validateAlphabet(){
        Scanner input = new Scanner(System.in);
        String output;
        String regex = "^[\\w]{3,30}+$";
        boolean checkRegex = false;
        do {
            String number = input.nextLine();
            output = number;
            checkRegex = number.matches(regex);
            if (!checkRegex) {
                System.out.println("Bạn nhập sai định dạng, Nhập tiếng việt không dấu tối thiểu 3 ký tự, max 30 ký tự");

            }
        } while (!checkRegex);
        return output;
    }

    public int checkNumber() {
        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập vào số");
            }
        }
        return input;
    }

}
