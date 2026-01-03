package classandobjects;

public class ClassObjects {
    public static void main(String[] args) {
        Car car1 = new Car();//object created
        Car car2 = new Car();//object created

        car1.brand = "Toyato";
        car1.color = "red";
        car1.speed = 100;
        car1.drive();

        car2.brand = "HHHH";
        car2.color = "black";
        car2.speed = 200;
        car2.drive();
    }
}
