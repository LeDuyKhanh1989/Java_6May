package Menu;

import ReadAndWrite.ReadAndWriteUser;
import User.User;
import Validate.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Register {


    public static User user;

    public void register() {
        Validate validate = new Validate();
        int choice = -1;
        System.out.println("---------------Register form---------------");
        System.out.println("1. Đăng nhập");
        System.out.println("0. Thoát");
        while (choice != 0) {
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = validate.checkNumber();
            switch (choice) {
                case 1:
                    signin();
                    break;
            }
        }
    }

    public void signin() {
        ReadAndWriteUser readAndWriteUser = new ReadAndWriteUser();
        List<User> readingUserList = null;
        try {
            readingUserList = readAndWriteUser.readUser();
            Scanner inputStr = new Scanner(System.in);
            boolean checkAccount = true;
            while (checkAccount) {
                System.out.println("Nhập vào tài khoản của bạn: ");
                String account = inputStr.nextLine();
                System.out.println("Nhập vào mật khẩu của bạn: ");
                String password = inputStr.nextLine();
                for (int i = 0; i < readingUserList.size(); i++) {
                    if (account.equals(readingUserList.get(i).getAccount()) & password.equals(readingUserList.get(i).getPassword()) & readingUserList.get(i).getRole() == 0) {
                        UserAdminMenu userAdminMenu = new UserAdminMenu();
                        user = readingUserList.get(i);
                        userAdminMenu.showMenuUser();

                        checkAccount = false;
                    } else if (account.equals(readingUserList.get(i).getAccount()) & password.equals(readingUserList.get(i).getPassword()) & readingUserList.get(i).getRole() == 1) {
                        ClientUser clientUser = new ClientUser();
                        user = readingUserList.get(i);
                        clientUser.showClientPage();

                        checkAccount = false;
                    }
                }
                if (checkAccount) {
                    System.out.println("Tài khoản không tồn tại");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

