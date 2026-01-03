package Polymarphism;

public class polyBike extends polyVehical{

        boolean hascarrier;

        public polyBike(String brand, int speed, boolean hascarrier) {
            super(brand, speed);
            this.hascarrier = hascarrier;
        }
        @Override
    public void start(){
        System.out.println("bike started....");
    }
    //(method overloading)
    public void start(String greet){
        System.out.println("bike started...." + greet);
    }
        @Override
        public void displayinfo(){
            System.out.println("brand: " + getBrand() + "speed: " + getSpeed()+ "hascarreir:" + hascarrier);
        }
}
