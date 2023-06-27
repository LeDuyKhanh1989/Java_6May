import java.io.*;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Student> newArr = new ArrayList<>();
        Student student1= new Student("Minh", 24, "Hà Nội");
        Student student2= new Student("Hải", 25, "Hải Phòng");
        Student student3= new Student("Nguyên", 26, "Hà Nội");
        newArr.add(student1);
        newArr.add(student2);
        newArr.add(student3);
        System.out.println(newArr);
        File newfile = new File("test1.txt");
        File newfile2= new File("test2.csv");
        System.out.println(newfile.getAbsolutePath());
        System.out.println(newfile.exists());
        System.out.println(newfile2.exists());

//        FileWriter writer1= new FileWriter( newfile);
//        BufferedWriter bufer1= new BufferedWriter(writer1);
//        String data= "\n";
//       for (int i=0; i<newArr.size();i++){
//           data+= newArr.get(i).getName()+ ","+newArr.get(i).getAge()+","+newArr.get(i).getAddress()+"\n";
//           bufer1.write(data);
//           data="";
//       }
//       String conments= "Hellow world!";
//       bufer1.write(conments);
//       bufer1.close();
//       writer1.close();
//
        FileReader fileReader = new FileReader(newfile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data="";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            data+=line+"\n";
        }
        bufferedReader.close();
        data+=student1.getName()+","+student1.getAge()+","+student1.getAddress();
        FileWriter writer1= new FileWriter( newfile);
           BufferedWriter bufer1= new BufferedWriter(writer1);
           bufer1.write(data);
           bufer1.close();

//        ArrayList<Student> studentArr = new ArrayList<>(); //Tạo mảng mới
//        FileReader read1= new FileReader(newfile);  //Khai báo filreader
//        BufferedReader buff1 = new BufferedReader(read1); //Khai báo buferedreader
//        String line =null;                                // Tạo chuỗi trống để lưu dòng trong file
//        while((line= buff1.readLine())!=null){            // Nếu dòng không phải trống thì thực hiện lệnh
//            String[] arr = line.split(",");         // tạo 1 mảng mới để lưu phần tử chứa các trường trong contructor đươc lấy từ dòng được phân biệt bởi dấu ","
//            Student newstudent = new Student(arr[0],Integer.parseInt( arr[1]),arr[2]);  //tạo 1 đối tượng theo hàm khởi tạo Student
//            studentArr.add(newstudent);                  // Thêm đối tượng vừa tạo vào mảng mới
//        }
//        System.out.println(studentArr);
    }

}
