package Enegin;

import Manager.Manager;

public class Enegin extends Manager {
    private String major;

    public Enegin() {
    }

    public Enegin(String name, int age, String sex, String address, String major) {
        super(name, age, sex, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
