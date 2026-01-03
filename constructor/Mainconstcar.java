package constructor;

public class Mainconstcar {
    static void main(String[] args) {

    Constcar constcar1 = new Constcar("toyato","red",200);
//    constcar.brand = "toyato";
//    constcar.speed = 200;
//    constcar.color = "red";
        constcar1.drive();
        Constcar constcar2 = new Constcar("kia","black",400);
        constcar2.drive();
        Constcar constcar3 = new Constcar("AAAA");
        constcar3.drive();


        System.out.println(constcar2.getSpeed());
        constcar2.setSpeed(222);
        System.out.println(constcar2.getSpeed());
    }

}
