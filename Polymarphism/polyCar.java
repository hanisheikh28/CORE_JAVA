package Polymarphism;

public class polyCar extends polyVehical{

        int doors;

        public polyCar(String brand, int speed,int doors) {
            super(brand, speed);
            this.doors = doors;
        }
        @Override
    public void start(){
        System.out.println("car started....");
    }
}
