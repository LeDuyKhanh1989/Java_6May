package Manager;

public class Manager {
    private int ID;
    private String name;
    private int age;
    private String sex;
    private String address;
    public static int increaseID=0;

    public Manager() {
        increaseID++;
        this.ID=increaseID;
    }

    public Manager(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        increaseID++;
        this.ID=increaseID;
    }

    public int getID() {
        return ID;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
