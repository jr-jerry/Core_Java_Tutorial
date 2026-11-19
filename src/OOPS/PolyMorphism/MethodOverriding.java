package OOPS.PolyMorphism;

public class MethodOverriding {
    static void main(String[] args) {
        Father001 refVar=new Child002();
        refVar.startVehicle();
    }
}
class Father001{
    public void startVehicle(){
        System.out.println("startVehicle scooter ");
    }
}
class Child002 extends Father001{
    @Override
    public void startVehicle() {
        System.out.println("BMW electric start");
    }
}
class Child001 extends Father001{
    @Override
    public void startVehicle() {
        System.out.println("startVehicle Bike ");
    }
}