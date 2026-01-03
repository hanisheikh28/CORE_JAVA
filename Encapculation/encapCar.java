package Encapculation;

public class encapCar {
    String brand;
    String color;
    private int speed;

    public encapCar(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public encapCar(int speed) {
        this.speed = speed;
    }

    public encapCar(String color) {
        this.color = color;
    }

    public int getSpeed() {
        if(speed<0){
            speed=0;
        }
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive (){
        System.out.println(brand + " is driving at " + speed);
    }
}
