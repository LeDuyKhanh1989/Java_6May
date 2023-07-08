package ReadAndWrite;

import User.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteUser {
    File userFile = new File("E:\\demogit\\Java_CodeGym\\Bai1\\Modul_2_QLDT\\src\\Data\\User.csv");
    public List<User> readUser() throws IOException {
        List<User> userArr = new ArrayList<>();
        FileReader file = new FileReader(userFile);
        BufferedReader buff = new BufferedReader(file);
        String line = null;
        String[] newArr = new String[3];
        while ((line = buff.readLine()) != null) {
            newArr = line.split(",");
            User newUser = new User(newArr[0], newArr[1],Integer.parseInt(newArr[2]));
            userArr.add(newUser);
        }
        buff.close();
        return userArr;
    }
    public void writeUser(List<User> userList) throws IOException {
        String data = "";
        for (int i = 0; i < userList.size(); i++) {
            data += userList.get(i).getAccount() + "," + userList.get(i).getPassword() + ","
                    + userList.get(i).getRole() +"\n";
        }
        FileWriter writer1 = new FileWriter(userFile);
        BufferedWriter bufer1 = new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
}
