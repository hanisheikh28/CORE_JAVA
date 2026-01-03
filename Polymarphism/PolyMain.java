package Polymarphism;

public class PolyMain {
    static void main(String[] args) {
        polyCar pc1 = new polyCar("toyota",200,5);
        pc1.displayinfo();
        pc1.start();
        polyBike pb1 = new polyBike("2wheeler",200,true);
        pb1.displayinfo();
        pb1.start();

        polyVehical pv = new polyVehical("vehical brand",200);
        pv.start();//op vehical started

        //Method Overriding(Runtime Polymorphism)
        polyVehical pv2 = new polyCar("parentclass",222,10);
        pv2.start();//op car started


        polyVehical pv3 = new polyBike("parentclass",222,false);
        pv3.start();//op vehical started


        //method overloading
        pb1.start("hello");
    }
}
