public class Family extends Street{
    private int familyID=1000;
    private String familyName;

    public Family() {

    }

    public int getFamilyID() {
        return familyID;
    }
    public void setFamilyID(int familyID) {
        this.familyID = familyID;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Family(String familyName) {
        familyID++;
        this.familyName = familyName;

    }
}

