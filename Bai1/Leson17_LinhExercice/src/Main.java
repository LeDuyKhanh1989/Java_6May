import Student.ManageStudent;
import Student.Student;
import Student.MenuManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        MenuManager menu = new MenuManager();
        menu.showMenu();
    }
}