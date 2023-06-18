package Manager;

import Main.MainFunction;

import javax.security.auth.Subject;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManageManager implements MainFunction<Manager> {
    Manager productManager= new Manager("Thục", 33, "Male","Thanh Hóa");
    Manager saleManager= new Manager("Hảo", 33, "Male","Thái Bình");
    Manager accountingManager= new Manager("Nguyên", 29, "Male","Hà Nội");
    public Manager[] arrayManager= {productManager,saleManager,accountingManager};
    public ArrayList<Manager> arr= new ArrayList<>();

    @Override
    public Manager[] add() {
        arrayManager= Arrays.copyOf(arrayManager,arrayManager.length+1);
        Manager object= new Manager();
        Scanner inputAdd = new Scanner( System.in);
        System.out.println("Add the name:  ");
        String name= inputAdd.nextLine();
        System.out.println("Add the age:  ");
        int age= inputAdd.nextInt();
        System.out.println("Add the address: ");
        inputAdd.nextLine();
        String address= inputAdd.nextLine();
        System.out.println("Add the gender: ");
        String sex= inputAdd.nextLine();
        object.setName(name);
        object.setAge(age);
        object.setAddress(address);
        object.setSex(sex);
        arrayManager[arrayManager.length-1]=object;
        return arrayManager;
    }

    @Override
    public Manager[] edit(int id) {
        if(findIndex(id)==-1){
            System.out.println("Can not found out the object with this ID");
        }else {
            Scanner input = new Scanner( System.in);
            System.out.println("Change the object's info");
            System.out.println("Change the name:  ");
            String name= input.nextLine();
            System.out.println("Change the age:  ");
            int age= input.nextInt();
            System.out.println("Change the address: ");
            input.nextLine();
            String address= input.nextLine();
            System.out.println("Change gender: ");
            String sex= input.nextLine();
            arrayManager[findIndex(id)].setAge(age);
            arrayManager[findIndex(id)].setName(name);
            arrayManager[findIndex(id)].setAddress(address);
            arrayManager[findIndex(id)].setSex(sex);
        }
        return arrayManager;
    }
    @Override
    public void show() {
        for (Manager m:arrayManager
             ) {
            System.out.println("=================================");
            System.out.println("ID: "+m.getID()+" Name: "+m.getName()+ " Age: "+m.getAge()+ " Address: "+ m.getAddress()+" Gender: "+m.getSex());
        }
    }
    public int findIndex(int id){
        for (int i= 0; i<arrayManager.length;i++){
           if(arrayManager[i].getID()==id){
               return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(int id) {
        Manager[] newArray= new Manager[arrayManager.length-1];
        if((findIndex(id)==-1)){
            System.out.println("The program can not find this ID");
        } else{
            for (int i=0; i<arrayManager.length; i++){

                if(i<findIndex(id)){
                    newArray[i]=arrayManager[i];
                } else if(i==findIndex(id)){
                    newArray[i]=arrayManager[i+1];
                } else {
                    for (int j=findIndex(id)+1;j<newArray.length;j++){
                        newArray[j]=arrayManager[j+1];
                    }
                }
            }
            arrayManager=Arrays.copyOf(newArray,newArray.length);
        }
    }

    public void search(int id){
        if((findIndex(id)==-1)){
            System.out.println("The program can not find this ID");
        } else{
            for (int i=0; i<arrayManager.length; i++){
                if(i==findIndex(id)){
                    System.out.println("The object need to find: name - "+ arrayManager[i].getName()+ " age - "+ arrayManager[i].getAge()+ " address - "+ arrayManager[i].getAddress() + " Gender - "+ arrayManager[i].getSex());
                }
            }
        }
    }
}
