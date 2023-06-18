package Khoi;

import KhoiA.KhoiA;
import KhoiA.ManageABlock;
import KhoiB.ManageBBlock;
import KhoiC.ManageCBlock;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        String menu = "=======Main menu=========\n1.Manager Block A\n2.Manager Block B\n3.Manager Block C\n0.Exit";
        int chooce;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("your choose is: ");
            chooce = input.nextInt();
            switch (chooce) {
                case 1:
                    showA();
                    break;
                case 2:
                    showB();
                    break;
                case 3:
                    showC();
                    break;
            }
        } while (chooce != 0);
    }

    public void showA() {
        String menu = "=======Block A=========\n1.add student\n2.Delete student\n" +
                "3.Fix student\n4.Searching\n5.Show all\n0.Exit";
        ManageABlock manageA = new ManageABlock();

        int choice;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("Your choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    manageA.add();
                    break;
                case 2:
                    System.out.println("Nhập vào ID muốn xóa");
                    Scanner delete1=new Scanner(System.in);
                    int id1 = delete1.nextInt();
                    manageA.delete(id1);
                    break;
                case 3:
                    System.out.println("Nhập vào ID muốn sửa");
                    Scanner delete2=new Scanner(System.in);
                    int id2 = delete2.nextInt();
                    manageA.edit(id2);
                    break;
                case 4:
                    break;
                case 5:

                    break;
            }
        } while (choice != 0);
    }
    public void showB() {
        String menu = "=======Block B=========\n1.add student\n2.Delete student\n" +
                "3.Fix student\n4.Searching\n5.Show all\n0.Exit";
        ManageBBlock manageB = new ManageBBlock();

        int choice;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("Your choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    manageB.add();
                    break;
                case 2:
                    System.out.println("Nhập vào ID muốn xóa: ");
                    Scanner delete3=new Scanner(System.in);
                    int id3 = delete3.nextInt();
                    manageB.delete(id3);
                    break;
                case 3:
                    System.out.println("Nhập vào ID muốn sửa");
                    Scanner delete4=new Scanner(System.in);
                    int id4 = delete4.nextInt();
                    manageB.edit(id4);
                    break;
                case 4:
                    break;
                case 5:
                    manageB.showB();
                    break;
            }
        } while (choice != 0);
    }
    public void showC() {
        String menu = "=======Block C=========\n1.add student\n2.Delete student\n" +
                "3.Fix student\n4.Searching\n5.Show all\n0.Exit";
        ManageCBlock manageC = new ManageCBlock();

        int choice;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("Your choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    manageC.add();
                    break;
                case 2:
                    System.out.println("Nhập vào ID muốn xóa: ");
                    Scanner delete5=new Scanner(System.in);
                    int id5 = delete5.nextInt();
                    manageC.delete(id5);
                    break;
                case 3:
                    System.out.println("Nhập vào ID muốn sửa");
                    Scanner delete6=new Scanner(System.in);
                    int id6 = delete6.nextInt();
                    manageC.edit(id6);
                    break;
                case 4:
                    break;
                case 5:
                    manageC.showC();
                    break;
            }
        } while (choice != 0);
    }
}

