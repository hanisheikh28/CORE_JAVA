package Interfaces;

import java.sql.SQLOutput;

public class ElectricCar implements CarControls {

    @Override
    public void turnRight() {
        System.out.println("ELECTRIC RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void applyBreakes() {
        System.out.println("Electric Breaks");
    }
}
