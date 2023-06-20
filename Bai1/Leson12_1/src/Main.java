import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //+ Nhập vào 1 số, kiểm tra xem số đó là chẵn hay lẻ
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào số n: ");
//        int numberN= Integer.parseInt(input.nextLine());
//        if(numberN%2==0){
//            System.out.println("Số "+numberN+" là sỗ chẵn");
//        } else {
//            System.out.println("Số "+numberN+" là sỗ lẻ");
//        }


        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

