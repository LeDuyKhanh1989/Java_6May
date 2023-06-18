package Animal;

public class Dog extends Animal{
    private String featherColor;
    private String dogType;

    public Dog(String name, int dateBorn, String featherColor, String dogType) {
        super(name, dateBorn);
        this.featherColor = featherColor;
        this.dogType = dogType;
        increaseID++;
        super.ID=increaseID;
    }

    public Dog() {

    }

    public Dog(String featherColor, String dogType) {
        this.featherColor = featherColor;
        this.dogType = dogType;

    }

    @Override
    public String makeSound() {
       return "This is Dog class";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }
}
