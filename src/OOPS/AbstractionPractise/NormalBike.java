package OOPS.AbstractionPractise;

public class NormalBike extends Bike {
    @Override
    public void gearUp() {
        System.out.println("NormalBike gearUp with cluth ");
    }

    @Override
    public void applyBreak() {
        System.out.println("NormalBike apply drum break ");
    }

    @Override
    public void accelerate() {
        System.out.println("NormalBike accelerate  0 - 70 in 5 sec ");
    }
}
