import java.util.Scanner;

public class Bai5 {
    //+ Viết chương trình nhập 1 số nguyên có 3 chữ số. Hãy in ra cách đọc của số nguyên này

    public static String number(int number) {
        switch (number) {
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bẩy";
            case 8:
                return "tám";
            case 9:
                return "chín";
        }
        return null;
    }
    public static String dozens(int number) {
        switch (number) {

            case 1:
               return "mười";
            case 2:
                return "hai mươi";
            case 3:
                return "ba mươi";
            case 4:
                return "bốn mươi";
            case 5:
                return "năm mươi";
            case 6:
                return "sáu mươi";
            case 7:
                return "bẩy mươi";
            case 8:
                return "tám mươi";
            case 9:
                return "chín mươi";
        }
        return null;
    }
    public static String hundres(int number) {
        switch (number) {

            case 1:
               return "một trăm";

            case 2:
                return "hai trăm";

            case 3:
                return "ba trăm";

            case 4:
                return "bốn trăm";

            case 5:
                return "năm trăm";

            case 6:
                return "sáu trăm";

            case 7:
                return "bẩy trăm";

            case 8:
                return "tám trăm";

            case 9:
                return "chín trăm";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số N: ");
        int numberN = input.nextInt();
        if(numberN>999||numberN<-1){
            System.out.println("Số nằm ngoài phạm vi đọc, mời nhập lại");
            System.out.println("Nhập vào số N: ");
            int numberN2 = input.nextInt();
            numberN=numberN2;
        }
        String numberString="";
        int hundres= (int) numberN/100;
        int dozen=(int)(numberN%100)/10;
        int numberEnd=numberN%10;

        if(numberEnd==0){
            numberString+= hundres(hundres)+" "+dozens(dozen);
        }else if(dozen==0){
                numberString+= hundres(hundres)+" "+"linh"+" "+number(numberEnd);
        } else {
                numberString+= hundres(hundres)+" "+dozens(dozen)+" "+number(numberEnd);
        }
        System.out.println("Số vừa nhập là: "+ numberN);
        System.out.println(numberString);

    }
}
