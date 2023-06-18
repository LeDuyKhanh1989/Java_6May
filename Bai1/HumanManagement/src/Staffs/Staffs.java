package Staffs;

import Manager.Manager;

public class Staffs extends Manager {
    private String job;

    public Staffs() {
    }

    public Staffs(String name, int age, String sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
