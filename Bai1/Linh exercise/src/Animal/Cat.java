package Animal;

public class Cat extends Animal{
 private String eyeColor;
 private boolean health= true;
 private String catType;

 private String medicine;
 private String food;

 public Cat(){

 }

    public String sickness(){
     return "Take a medicine";
    }

    public void takeTheFood(){
     if (this.health=true){
         this.medicine="Thuốc bổ";
         this.food="Thịt";
     } else {
         this.medicine="Thuốc bệnh";
         this.food="Sữa";
     }
    }
    public Cat(String eyeColor, boolean health, String catType) {
        this.eyeColor = eyeColor;
        this.health = health;
        this.catType = catType;

    }

    @Override
    public String makeSound() {
        return "This is Cat class";
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
