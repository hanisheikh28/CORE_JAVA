package constructor;
//getter d=and setter
public class Constcar {
    public String brand;
    String color;
    int speed;

    public Constcar(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    //single parameter
    public Constcar(String brand) {
//        System.out.println("consturctor called: ");
        this.brand = brand;
    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
