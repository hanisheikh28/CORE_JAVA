package Inheritance;

public class InheritMain {
    static void main(String[] args) {
//        InheritVehical inheritavehical = new InheritVehical("honda",222);
//        inheritavehical.display();//output Parent class called

        inhertCar inhertcar = new inhertCar("kia",999,5);
        inhertcar.displayinfo();
//        inhertCar inhertcar = new inhertCar("kia",999,4);
//        InheritVehical inhertCar = new InheritVehical("hondaaa",333, 4);



        InheritBike inheritbike = new InheritBike("ford",555,true);
        inheritbike.displayinfo();
    }
}
