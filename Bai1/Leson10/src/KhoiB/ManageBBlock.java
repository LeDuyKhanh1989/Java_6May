package KhoiB;

import Khoi.Manage;
import KhoiA.KhoiA;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageBBlock implements Manage<KhoiB> {
    private ArrayList<KhoiB> arrB= new ArrayList<>();

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán là: ");
        double toan=input.nextDouble();
        System.out.println("Nhập vào điểm môn Sinh là: ");
        double sinh = input.nextDouble();
        System.out.println("Nhập vào điểm môn Hoá là: ");
        double hoa=input.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = input.nextLine();
        KhoiB student=new KhoiB();
        student.setSubject1(toan);
        student.setSubject2(sinh);
        student.setSubject3(hoa);
        student.setStudentName(name);
        student.setStudentAge(age);
        arrB.add(student);
    }

    @Override
    public void edit(int id) {
        Scanner inputEdit = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán là: ");
        double toan=inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn sinh là: ");
        double sinh = inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn Hoá là: ");
        double hoa=inputEdit.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        inputEdit.nextLine();
        String name = inputEdit.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = inputEdit.nextLine();
        arrB.get(findIndex(id)).setSubject1(toan);
        arrB.get(findIndex(id)).setSubject2(sinh);
        arrB.get(findIndex(id)).setSubject3(hoa);
        arrB.get(findIndex(id)).setStudentAge(name);
        arrB.get(findIndex(id)).setStudentAge(age);
    }

    @Override
    public int findIndex(int id) {
        for (int i=0; i<arrB.size();i++){
            if(arrB.get(i).getStudentID()==id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(int id) {
        int index= findIndex(id);
        arrB.remove(index);
    }
    public void showB(){
        for (int i=0; i<arrB.size();i++){
            System.out.println("==================================");
            System.out.println("ID: "+arrB.get(i).getStudentID()+" -- Name: "+ arrB.get(i).getStudentName()+ " -- Age: "+arrB.get(i).getStudentAge()+ " -- Subject score: Toán - "+arrB.get(i).getSubject1()+" -- Sinh: "+arrB.get(i).getSubject2()+" --Hóa: "+arrB.get(i).getSubject3());
        }
    }
}
