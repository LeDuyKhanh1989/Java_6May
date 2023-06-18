package Animal;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ManageCat implements Addition<Cat>{
    public Cat[] arr= {}; //Khai mảng rỗng
    @Override
    public void add(Cat obj) {
        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=obj;
    }

    public int findIndex(Cat obj){
        for (int i = 0; i< arr.length;i++){
            if(arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Cat[] edit(Cat obj) {
        if (findIndex(obj) == -1) {
            System.out.println("Không tìm thấy đối tượng này");
        } else {
            Cat newCat= new Cat();
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào mầu mắt mèo: ");
            String eyeColor= input.nextLine();
            newCat.setEyeColor(eyeColor);
            System.out.println("Nhập vào tên mèo: ");
            String newName= input.nextLine();
            newCat.setName(newName);
            System.out.println("Nhập vào mầu lông: ");
            String newFeather= input.nextLine();
            newCat.setFeatherColor(newFeather);
            arr[findIndex(obj)]=newCat;

        }
        return arr;
    }

    @Override
    public Cat[] delete(Cat obj) {
        return arr;

    }

    @Override
    public Cat[] show() {
        return arr;
    }
}
