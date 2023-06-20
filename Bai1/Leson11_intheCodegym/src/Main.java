import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của stack: ");
        int numberofStack= Integer.parseInt(input.nextLine());
        for (int i = 0; i <numberofStack ; i++) {
            System.out.println("Nhập vào ký tự thứ "+i);
            String charI= input.nextLine();
            stack.push(charI);
        }
        String[] arr= new String[stack.size()];
        int n= stack.size();
        for (int i = 0; i <n ; i++) {
            arr[i]=stack.pop();
            System.out.println(arr[i]);
        }

    }
}