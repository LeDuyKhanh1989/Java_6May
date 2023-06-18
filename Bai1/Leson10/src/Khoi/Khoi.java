package Khoi;

public class Khoi {
    private double subject1;
    private double subject2;
    private double subject3;
    private String studentName;
    private String studentAge;
    private int studentID;
    public static int idIncreasing=0;

    public Khoi() {
        idIncreasing++;
        studentID=1000+idIncreasing;
    }
    public Khoi(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        idIncreasing++;
        studentID=1000+idIncreasing;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getSubject1() {
        return subject1;
    }
    public void setSubject1(double subject1) {
        this.subject1 = subject1;
    }
    public double getSubject2() {
        return subject2;
    }
    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }
    public double getSubject3() {
        return subject3;
    }
    public void setSubject3(double subject3) {
        this.subject3 = subject3;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
}
