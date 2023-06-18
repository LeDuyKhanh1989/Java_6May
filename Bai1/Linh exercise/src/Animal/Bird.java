package Animal;

public class Bird extends Animal{
    private String mounth;
    private String fly;

    public Bird(String mounth, String fly) {
        this.mounth = mounth;
        this.fly = fly;

    }

    @Override
    public String makeSound() {
        return "This is Bird class";
    }
}
