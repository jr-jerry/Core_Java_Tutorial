package OOPS.Ensulation.WE;

public class LearningEncapsulation {
    static void main(String[] args) {
        Capsule1 dsrCapsule = new Capsule1();
        dsrCapsule.setMedicine("poison");
        System.out.println("DsrCapsule Medicine: " + dsrCapsule.getMedicine());
    }
}
class Capsule1{
    private String medicine;

    public String getMedicine() {
        return medicine;
    }
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}