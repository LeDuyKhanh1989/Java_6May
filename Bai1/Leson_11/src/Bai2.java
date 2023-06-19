import java.util.Scanner;

public class Bai2 {
    // Nhập vào n. Tính S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số N");
        int n=input.nextInt();
        double s=100;
        for (int i = 0; i < n; i++) {
            s+= (n*(n+1))/(n+1)*(n+2);
        }
        System.out.println(s);
    }
}
