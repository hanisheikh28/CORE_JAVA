package Polymarphism;

public class polyVehical {
    public String brand;
    public int speed;

    public polyVehical(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void start(){
        System.out.println("vehical started....");
    }


    public  void displayinfo(){
        System.out.println("brand: " + brand + " , Speed is running at: " + speed);
    }
}
