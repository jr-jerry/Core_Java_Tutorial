package OOPS.AbstractionPractise;

public class Main {
    static void main() {
        Bike bikeRef=new NormalBike();
        bikeRef.accelerate();
        bikeRef.gearUp();
        bikeRef.applyBreak();
    }
}
