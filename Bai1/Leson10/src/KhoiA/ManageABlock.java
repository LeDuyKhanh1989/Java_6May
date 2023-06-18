package KhoiA;

import Khoi.Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageABlock implements Manage<KhoiA> {
    private ArrayList<KhoiA> arrA= new ArrayList<>();

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán là: ");
        double toan=input.nextDouble();
        System.out.println("Nhập vào điểm môn Lý là: ");
        double ly = input.nextDouble();
        System.out.println("Nhập vào điểm môn Hoá là: ");
        double hoa=input.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = input.nextLine();
        KhoiA student=new KhoiA();
        student.setSubject1(toan);
        student.setSubject2(ly);
        student.setSubject3(hoa);
        student.setStudentName(name);
        student.setStudentAge(age);
        arrA.add(student);
    }

    @Override
    public void edit(int id) {
        Scanner inputEdit = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán là: ");
        double toan=inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn Lý là: ");
        double ly = inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn Hoá là: ");
        double hoa=inputEdit.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        inputEdit.nextLine();
        String name = inputEdit.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = inputEdit.nextLine();
        arrA.get(findIndex(id)).setSubject1(toan);
        arrA.get(findIndex(id)).setSubject2(ly);
        arrA.get(findIndex(id)).setSubject3(hoa);
        arrA.get(findIndex(id)).setStudentAge(name);
        arrA.get(findIndex(id)).setStudentAge(age);
    }

    @Override
    public int findIndex(int id) {
        for (int i=0; i<arrA.size();i++){
            if(arrA.get(i).getStudentID()==id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(int id) {
    int index= findIndex(id);
    arrA.remove(index);
    }
    public void showA(){
        for (int i=0; i<arrA.size();i++){
            System.out.println("==================================");
            System.out.println("ID: "+arrA.get(i).getStudentID()+" -- Name: "+ arrA.get(i).getStudentName()+ " -- Age: "+arrA.get(i).getStudentAge()+ " -- Subject score: Toán - "+arrA.get(i).getSubject1()+" -- Sinh: "+arrA.get(i).getSubject2()+" --Hóa: "+arrA.get(i).getSubject3());
        }
    }
}
