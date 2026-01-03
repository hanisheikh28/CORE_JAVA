package Inheritance;

public class InheritBike extends InheritVehical{
    boolean hascarrier;

    public InheritBike(String brand, int speed, boolean hascarrier) {
        super(brand, speed);
        this.hascarrier = hascarrier;
    }
    @Override
    public void displayinfo(){
        System.out.println("brand: " + getBrand() + "speed: " + getSpeed()+ "hascarreir:" + hascarrier);
    }
}
