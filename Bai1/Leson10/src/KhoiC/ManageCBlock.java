package KhoiC;

import Khoi.Manage;
import KhoiB.KhoiB;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCBlock implements Manage<KhoiC> {
    private ArrayList<KhoiC> arrC= new ArrayList<>();

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Văn là: ");
        double van=input.nextDouble();
        System.out.println("Nhập vào điểm môn Sử là: ");
        double su = input.nextDouble();
        System.out.println("Nhập vào điểm môn Địa là: ");
        double dia=input.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = input.nextLine();
        KhoiC student=new KhoiC();
        student.setSubject1(van);
        student.setSubject2(su);
        student.setSubject3(dia);
        student.setStudentName(name);
        student.setStudentAge(age);
        arrC.add(student);
    }

    @Override
    public void edit(int id) {
        Scanner inputEdit = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Văn là: ");
        double van=inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn Sử là: ");
        double su = inputEdit.nextDouble();
        System.out.println("Nhập vào điểm môn Địa là: ");
        double dia=inputEdit.nextDouble();
        System.out.println("Nhập vào họ tên sinh viên: ");
        inputEdit.nextLine();
        String name = inputEdit.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        String age = inputEdit.nextLine();
        arrC.get(findIndex(id)).setSubject1(van);
        arrC.get(findIndex(id)).setSubject2(su);
        arrC.get(findIndex(id)).setSubject3(dia);
        arrC.get(findIndex(id)).setStudentAge(name);
        arrC.get(findIndex(id)).setStudentAge(age);
    }

    @Override
    public int findIndex(int id) {
        for (int i=0; i<arrC.size();i++){
            if(arrC.get(i).getStudentID()==id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(int id) {
        int index= findIndex(id);
        arrC.remove(index);
    }
    public void showC(){
        for (int i=0; i<arrC.size();i++){
            System.out.println("==================================");
            System.out.println("ID: "+arrC.get(i).getStudentID()+" -- Name: "+ arrC.get(i).getStudentName()+ " -- Age: "+arrC.get(i).getStudentAge()+ " -- Subject score: Văn - "+arrC.get(i).getSubject1()+" -- Sử: "+arrC.get(i).getSubject2()+" --Địa: "+arrC.get(i).getSubject3());
        }
    }
}
