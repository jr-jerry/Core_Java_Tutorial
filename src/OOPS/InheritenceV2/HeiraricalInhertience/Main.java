package OOPS.InheritenceV2.HeiraricalInhertience;

public class Main {
    static void main(String[] args) {
         Car car =new Ferrari();
         car.start();
         car.stop();
    }
}
class Car {
    public void start(){
        System.out.println("Car start ");
    }
    public void stop(){
        System.out.println("Car stop");
    }
}
class Ferrari extends Car {
    public void openGate(){
        System.out.println("Ferrari open gate");
    }
}

class Maruti extends Car {
}

class Maruti800 extends Maruti {

}