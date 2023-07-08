package Menu;

import Manager.UserManager;
import ReadAndWrite.ReadAndWriteUser;
import User.User;
import Validate.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserAdminMenu {
    public void showMenuUser() throws IOException {
        ReadAndWriteUser readAndWriteUser = new ReadAndWriteUser();
        AdminManagerMenu adminManagerMenu = new AdminManagerMenu();
        UserManager userManager = new UserManager();
        Scanner inputSTR = new Scanner(System.in);
    Validate validate = new Validate();
    int choice = -1;
        showUserNote();
        while (choice != 0) {
        System.out.println("Nhập vào lựa chọn của bạn: ");
        choice = validate.checkNumber();
        switch (choice) {
            case 1:
                register();
                showUserNote();
                break;
            case 2:
                try {
                    List<User> list= readAndWriteUser.readUser();
                    for (User l:list) {
                        System.out.println(l);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                showUserNote();
                break;
            case 3:
                System.out.println("Nhập vào tài khoản muốn sửa");
                String accountEdit= inputSTR.nextLine();
                userManager.Edit(accountEdit);
                showUserNote();
                break;
            case 4:
                System.out.println("Nhập vào tài khoản muốn xóa");
                String accountDelete= inputSTR.nextLine();
                userManager.delete(accountDelete);
                showUserNote();
                break;
            case 5:
                adminManagerMenu.ShowAdminPage();
                break;
            case 0:
                Register newRegister = new Register();
                newRegister.register();
                System.out.println("---------------Register form---------------");
                System.out.println("1. Đăng nhập");
                System.out.println("0. Thoát");
                break;
        }

    }
}
public void showUserNote(){
    System.out.println("---------------User Admin form---------------");
    System.out.println("1. Đăng ký");
    System.out.println("2. Xem các tài khoản đẵ đăng ký");
    System.out.println("3. Sửa tài khoản");
    System.out.println("4. Xóa tài khoản");
    System.out.println("5. AdminPage");
    System.out.println("0. Thoát");
}
    public List<User> register() {
        UserManager userManager = new UserManager();
        userManager.add();
      return userManager.showall();
    }
}


