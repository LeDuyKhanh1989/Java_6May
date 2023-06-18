package Animal;

public class Animal {
    private String name;
    private int ID;
    public static int getID;

    public Animal() {
        getID++;
        this.ID=getID;
    }

    public Animal(String name) {
        this.name = name;
        getID++;
        this.ID=getID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }
}
