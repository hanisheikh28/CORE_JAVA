package constructor;
record Bike(String brand,int speed) {//record provide getter,constructor ,two string objects

}

public class recordClass {
    static void main(String[] args) {

          Bike bike = new Bike("CCCC",888);
            System.out.println("Brand: " + bike.brand());
            System.out.println("Speed: " + bike.speed());
            System.out.println(bike);//two string
        }

}
