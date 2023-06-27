import java.util.ArrayList;
import java.util.List;

public class Family{
    int homeNum;
    int familyNum=0;
    List<Person> People =new ArrayList<>();

    public Family(int homeNum) {
        this.homeNum = homeNum;
    }
    public int getHomeNum() {
        return homeNum;
    }
    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }
    public int getFamilyNum() {
        return familyNum;
    }
    public void setFamilyNum(int familyNum) {
        this.familyNum = familyNum;
    }
    public List<Person> getPeople() {
        return People;
    }
    public void setPeople(List<Person> people) {
        this.People = people;
    }
    public void addFamily(Person person,int homeNum){
        this.homeNum=homeNum;
        this.familyNum=this.familyNum+1;
        People.add(person);
    }
    public int findPersonIndex(int id){
        for (int i = 0; i < this.People.size(); i++) {
            if(this.People.get(i).getCmnd()==id){
                return i;
            }
        }
        return -1;
    }
    public void editPerson(int id, Person person, int homeNum){
        int index = findPersonIndex(id);
        People.set(index,person);
        this.homeNum=homeNum;
    }
    @Override
    public String toString() {
        return "Family{" +
                "homeNum=" + homeNum +
                ", familyNum=" + familyNum +
                ", People=" + People +
                '}';
    }
}
