package Animal;

public class Dog extends Animal{
    private String featherColor;
    private String eyeColor;

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

    public Dog() {
    }

    public Dog(String featherColor, String eyeColor) {
        this.featherColor = featherColor;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "featherColor='" + featherColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
