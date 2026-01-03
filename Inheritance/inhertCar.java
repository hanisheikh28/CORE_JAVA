package Inheritance;

public class inhertCar extends InheritVehical {
    int doors;

    public inhertCar(String brand, int speed,int doors) {
        super(brand, speed);
        this.doors = doors;
    }

//    public inhertCar(int doors) {
//        this.doors = doors;
//    }



//    public void displayCar(){
//        System.out.println("brand: " + getBrand() + ", speed: " + getSpeed()+ ", doors: " + doors);
//    }
//
    @Override
    public void displayinfo(){
     // super.displayinfo();
        System.out.println("brand: " + getBrand() + ", speed: " + getSpeed()+ ", doors: " + doors);
    }

}
