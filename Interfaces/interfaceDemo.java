package Interfaces;

public class interfaceDemo {
    static void main(String[] args) {
//        ElectricCar electric1 = new ElectricCar();
//        electric1.applyBreakes();
//        electric1.turnLeft();
        CarControls myCar = new ElectricCar();
        myCar.turnLeft();
        CarControls myCar2 = new SportsCar();
        myCar2.turnLeft();
    }
}
