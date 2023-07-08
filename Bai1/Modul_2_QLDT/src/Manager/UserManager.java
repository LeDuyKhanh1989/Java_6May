package Manager;

import ReadAndWrite.ReadAndWriteUser;
import User.User;
import Validate.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    Validate validate = new Validate();
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputSTR = new Scanner(System.in);
    ReadAndWriteUser readAndWriteUser = new ReadAndWriteUser();
    private List<User> userArr;

    public UserManager() {
        try {
            this.userArr = readAndWriteUser.readUser();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add() {
        System.out.println("Nhập vào tài khoản đăng nhập");
        String account = checkID();
        System.out.println("Nhập vào mật khẩu");
        String password = validate.validateAlphabet();
        System.out.println("Nhập vào phân quyền cho tài khoản (0 là quyên user, 1 là quyền admin ");
        int role = validate.checkNumber();
        User newUser = new User(account, password, role);
        userArr.add(newUser);
        try {
            readAndWriteUser.writeUser(userArr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void Edit(String account) {
        int index = findIndex(account);
        if (index == -1) {
            System.out.println("User không tồn tại");
        } else {
            System.out.println("Nhập vào mật khẩu");
            String password = validate.validateAlphabet();
            System.out.println("Nhập vào phân quyền cho tài khoản (0 là quyên user, 1 là quyền admin ");
            int role = validate.checkNumber();
            User newUser = new User(account, password, role);
            userArr.set(index, newUser);
            try {
                readAndWriteUser.writeUser(userArr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void delete(String account) {
        if (account.equals("Admin")) {
            System.out.println("Bạn không thể xóa tài khoản này");
        } else {
            int index = findIndex(account);
            if (index == -1) {
                System.out.println("User không tồn tại");
            } else {
                userArr.remove(index);
                try {
                    readAndWriteUser.writeUser(userArr);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int findIndex(String account) {
        for (int i = 0; i < userArr.size(); i++) {
            if (account.equals(userArr.get(i).getAccount())) {
                return i;
            }
        }
        return -1;
    }
    public List<User> showall() {
        try {
            return readAndWriteUser.readUser();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String checkID(){
        boolean checkSameID= true;
        String strID;
        while(checkSameID){
            String id= validate.validateAlphabet();
            strID= id;
            int index = findIndex(id);
            if(index==-1){
                checkSameID=false;
                return strID;
            } else {
                System.out.println("ID trùng, vui lòng nhập lại");
            }
        }
        return "ID này đã tốn tại";
    }
}
