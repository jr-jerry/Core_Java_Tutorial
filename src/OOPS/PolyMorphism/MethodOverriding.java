package OOPS.PolyMorphism;

public class MethodOverriding {
    static void main(String[] args) {
         Father001 fatherObjRefVar = new Child001();//Runtime PolyMorphism /Method Overriding
        System.out.println(fatherObjRefVar);
     fatherObjRefVar.startVehicle() ;
    }
}
class Father001{
    public void startVehicle(){
        System.out.println("startVehicle scooter ");
    }
}
class Child001 extends Father001{
    @Override
    public void startVehicle() {
        System.out.println("startVehicle Bike ");
    }
}