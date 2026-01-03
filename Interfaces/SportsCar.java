package Interfaces;

import java.sql.SQLOutput;

public class SportsCar implements CarControls{

    @Override
    public void turnRight() {
        System.out.println("Sports right");
    }

    @Override
    public void turnLeft() {
        System.out.println("sports left");
    }

    @Override
    public void applyBreakes() {
        System.out.println("apply breaks for sports car");
    }
}
