package Student;

import java.io.IOException;
import java.util.Scanner;

public class MenuManager {
    Scanner scanner = new Scanner(System.in);
    ManageStudent manageStudent = new ManageStudent();
    int choice = -1;
    public void showMenu() {
        do {
            System.out.println("***Chươnng trình quản lý học sinh***\n" +
                    "1. Thêm học sinh\n" +
                    "2. Sửa học sinh\n" +
                    "3. Xoá học sinh\n" +
                    "4. Tìm kiếm học sinh\n" +
                    "5. Hiển thị thông tin học sinh\n" +
                    "0. Thoát\n");
            System.out.println("Hãy nhập lựa chọn của bạn, nhập 0 để thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 5 || choice < 0) {
                    System.out.println("Số bạn nhập không trong phạm vi sử dụng");
                }
            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ, vui lòng nhập lại");
            }

            switch (choice) {
                case 1:
                    try {
                        manageStudent.add();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào ID muốn sinh viên muốn sửa");
                    int ID = Integer.parseInt(scanner.nextLine());
                    try {
                        manageStudent.fix(ID);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào ID muốn sinh viên muốn sửa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    try {
                        manageStudent.delete(idDelete);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    manageStudent.showAll();
                    break;
            }
        } while (choice != 0);
    }
    public int enterNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Số bạn nhập không hợp lệ");
            }
        }
    }
}
