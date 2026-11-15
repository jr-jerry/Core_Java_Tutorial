package OOPS.AbstractionPractise;

public class SuperBike extends Bike {

    @Override
    public void gearUp() {
        System.out.println("SuperBike gearUp without cluth ");
    }


    @Override
    public void applyBreak() {
        System.out.println("SuperBike disc break apply ");
    }

    @Override
    public void accelerate() {
        System.out.println("SuperBike accelerate 0 - 100 in 5 sec ");
    }
}
