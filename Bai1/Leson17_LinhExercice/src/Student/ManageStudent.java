package Student;
import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Student.Student;
public class ManageStudent {
    public static ArrayList<Student> arrStudent= new ArrayList<Student>();
    static Scanner inputNum=new Scanner(System.in);
    static Scanner inputStr=new Scanner(System.in);
    static File studentFile= new File("src/Student/Data.csv");
    public static List<Student> updateArr()throws FileNotFoundException, IOException{
        FileReader file = new FileReader(studentFile);
        BufferedReader buff = new BufferedReader(file);
        String line = null;
        String[] newArr = new String[4];
        while ((line = buff.readLine()) != null) {
            newArr=line.split(",");
            Student studentUpdate = new Student(newArr[1], Integer.parseInt(newArr[2]),newArr[3]);
            arrStudent.add(studentUpdate);
        }
        buff.close();
        return arrStudent;
    }
    public static void add() throws IOException {

        System.out.println("Nhập vào tên sinh viên");
        String name= inputStr.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        int age = inputNum.nextInt();
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String address= inputStr.nextLine();
        Student newStudent = new Student(name, age, address);
        arrStudent.add(newStudent);
        FileReader fileReader = new FileReader(studentFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data="";
        while ((line = bufferedReader.readLine()) != null) {
            data+=line+"\n";
        }
        bufferedReader.close();
        data+=newStudent.getID()+","+newStudent.getName()+","+newStudent.getAge()+","+newStudent.getAddress();
        FileWriter writer1= new FileWriter( studentFile);
        BufferedWriter bufer1= new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
    public static int findIndex(int ID){
        for (int i = 0; i < arrStudent.size(); i++) {
            if(arrStudent.get(i).getID()==ID){
                System.out.println(i);
                return i-1;
            }
        }
        return -1;
    }
    public static void showAll(){
        for (int i = 0; i < arrStudent.size(); i++) {
            System.out.println(arrStudent.get(i));
        }
    }
    public static void fix(int ID)throws IOException{
        int index = findIndex(ID);
        System.out.println("Nhập vào tên sinh viên");
        String name= inputStr.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        int age = inputNum.nextInt();
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String address= inputStr.nextLine();
        arrStudent.get(index).setName(name);
        arrStudent.get(index).setAge(age);
        arrStudent.get(index).setAddress(address);
        FileReader fileReader = new FileReader(studentFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data="";
        while ((line = bufferedReader.readLine()) != null) {
            data+=line+"\n";
        }
        bufferedReader.close();
        FileWriter writer1= new FileWriter( studentFile);
        BufferedWriter bufer1= new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
    public static void delete(int ID)throws IOException {
        int index = findIndex(ID);
        arrStudent.remove(index);
        FileReader fileReader = new FileReader(studentFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data="";
        while ((line = bufferedReader.readLine()) != null) {
            data+=line+"\n";
        }
        bufferedReader.close();
        FileWriter writer1= new FileWriter( studentFile);
        BufferedWriter bufer1= new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
}
