package Encapculation;

public class EncapMain {
    static void main(String[] args) {
 encapCar encapcar = new encapCar("BENZ","black",8888);
        System.out.println(encapcar.color);
       // System.out.println(encapcar.speed);//cant because its declared as private

    }
}
