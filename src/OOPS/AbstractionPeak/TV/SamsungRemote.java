package OOPS.AbstractionPeak.TV;

public class SamsungRemote implements Remote {
    @Override
    public void powerOn() {
        System.out.println("Samsung power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung power off");
    }
}
