public class Person extends Family {
    private int id;
    private String name;

    public Person( String name) {
        this.name = name;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
