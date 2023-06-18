package Animal;

public class Animal {
    protected int ID;
    protected String name;
    protected int dateBorn;
    public static int increaseID=1000;

    public String makeSound(){
      return "This is Animal class";
    }
    public Animal(){
        increaseID++;
        this.ID=increaseID;
    }

    public Animal(String name, int dateBorn) {
        this.name = name;
        this.dateBorn = dateBorn;
        increaseID++;
        this.ID=increaseID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(int dateBorn) {
        this.dateBorn = dateBorn;
    }
}
