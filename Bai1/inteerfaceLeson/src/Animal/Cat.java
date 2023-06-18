package Animal;

public class Cat extends Animal{
    private String featherColor;
    private String eyeColor;

    public static int catIndex=-1;

    public Cat() {
        catIndex++;
    }

    public static int getCatIndex() {
        return catIndex;
    }

    public Cat(String featherColor, String eyeColor) {
        this.featherColor = featherColor;
        this.eyeColor = eyeColor;
        catIndex++;
    }

    public String getFeatherColor() {
        return featherColor;
    }
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "featherColor='" + featherColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", ID='" + Animal.getID + '\'' +
                '}';
    }


}
