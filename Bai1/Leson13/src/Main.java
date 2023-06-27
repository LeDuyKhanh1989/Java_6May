import java.sql.SQLOutput;
import java.util.Scanner;

//Tổng 3 số nguyên
//Bạn được cho 2 số nguyên N và S. Nhiệm vụ của bạn là đếm số bộ 3 X, Y, Z (0<=X,Y,Z<=S) thỏa mãn X+Y+Z=S

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberN;
        int numberS;
        do {
            System.out.println("Nhập vào N");
            numberN = Integer.parseInt(input.nextLine());
            System.out.println("Nhập vào S");
            numberS = Integer.parseInt(input.nextLine());
        }
        while (numberN <= 0 || numberS <= 0);

        int count=0;
        if(numberS<numberN){
            System.out.println("Không đủ điều kiện duyệt");
        }else{
            for (int i = 0; i <= numberN; i++) {
                for ( int j=0; j<=numberN; j++){
                    for (int k=0; k<=numberN;k++){
                        if(i+j+k==numberS){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }
}