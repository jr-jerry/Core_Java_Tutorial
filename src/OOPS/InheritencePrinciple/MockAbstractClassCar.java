package OOPS.InheritencePrinciple;

public class MockAbstractClassCar {
    public void start(){
        System.out.println("Car start ");
    }
    public void stop(){
        System.out.println("Car stop");
    }
    public void speedUp(){
        System.out.println("Car speed up");
    }

    static void main() {
        PetroleumCar petroleumCar = new PetroleumCar();
        petroleumCar.speedUp();

        MockAbstractClassCar parentCarObjRef = new MockAbstractClassCar();
//        parentCarObjRef.accerlerate();

    }
}
class PetroleumCar extends MockAbstractClassCar {
    public void accerlerate(){
        System.out.println("petroleum car accelerate");
    }

}
class FerrariCar extends PetroleumCar {
    public void drift(){
        System.out.println("Ferrari car drifting");
    }
}
