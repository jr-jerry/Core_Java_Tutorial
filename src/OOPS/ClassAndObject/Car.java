package OOPS.ClassAndObject;

import java.util.Scanner;

public class Car {
    int carModel,carTopSpeed,carGear;
    String carColor;
    public void engineStartAction(){
        System.out.println("Car engine Start ");
    }
    public void accelerateAction(){
        System.out.println("Car accelerate ");
    }
    public void driveAction(){
        System.out.println("Car drive ");
    }
    public void breakAction(){
        System.out.println("Car break apply");
    }
    public void stopAction(){
        System.out.println("Car stop");
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car bmwObj=new Car();
        System.out.println("Enter car color ");
        bmwObj.carColor=input.nextLine();
        System.out.println("Enter car top speed ");
        bmwObj.carTopSpeed=input.nextInt();
        System.out.println("Enter car gear ");
        bmwObj.carGear=input.nextInt();
        System.out.println("Enter car Model ");
        bmwObj.carModel=input.nextInt();

        bmwObj.engineStartAction();
        bmwObj.accelerateAction();
        bmwObj.driveAction();
        bmwObj.breakAction();
        bmwObj.stopAction();
        System.out.println("Car Details "+bmwObj.carColor+" carModel "+bmwObj.carModel+" TopSpeed "+bmwObj.carTopSpeed+" Gear "+bmwObj.carGear);
    }
}
