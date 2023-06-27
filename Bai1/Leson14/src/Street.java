import java.util.ArrayList;
import java.util.List;

public class Street {
    int id;
    String name;
    List <Family> family=new ArrayList<>();

    public Street(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Family> getFamily() {
        return family;
    }

    public void setFamily(List<Family> family) {
        this.family = family;
    }

    // ***********
    public void addFamily(Family family, String name){
        this.name=name;
        this.family.add(family);
    }
    public int findFamilyIndex(int id){
        for (int i = 0; i < this.family.size(); i++) {
            if(this.family.get(i).getHomeNum()==id){
                return i;
            }
        }
        return -1;
    }
    public void editFamily(int idFamily, Family family1, String Name){
        int index = findFamilyIndex(id);
        family.set(index,family1);
        this.name=name;
    }
}
