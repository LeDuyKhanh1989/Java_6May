package Main;

import Manager.Manager;
import Manager.ManageManager;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        String menu = "=======Main menu=========\n1.Manager menu\n2.Engineer menu\n3.Staff menu\n0.Exit";
        int chooce;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("your choose is: ");
            chooce = input.nextInt();
            switch (chooce) {
                case 1:
                    showManage();
                    break;
                case 2:

                    break;
                case 3:
                    break;
            }
        } while (chooce != 0);
    }

    public void showManage() {
        String menu = "=======Manager menu=========\n1.Ddd manager\n2.Delete manager\n" +
                "3.Fix manager\n4.Searching\n5.Show all\n0.Exit";
        ManageManager showManager = new ManageManager();

        int choice;
        do {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("Your choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showManager.add();

                    break;
                case 2:
                    Scanner inputID2 = new Scanner(System.in);
                    System.out.println("Type the ID: ");
                    int id2 = inputID2.nextInt();
                    showManager.delete(id2);
                    break;
                case 3:
                    Scanner inputID = new Scanner(System.in);
                    System.out.println("Type the ID: ");
                    int id = inputID.nextInt();
                    showManager.edit(id);

                    break;
                case 4:
                    Scanner searchID= new Scanner(System.in);
                    System.out.println("Type the ID: ");
                    int searchInput= searchID.nextInt();
                    showManager.search(searchInput);
                    break;
                case 5:
                    showManager.show();
                    break;
            }
        } while (choice != 0);
    }

}

