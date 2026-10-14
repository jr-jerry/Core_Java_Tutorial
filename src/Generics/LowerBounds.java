package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBounds {
    static void main() {
        Bound<Child> childBound=new Bound<>(new Child());
        List<Child> childList=List.of(new Child(),new Child(),new Child());
        List<GrandFather> grandFathers=List.of(new GrandFather(),new GrandFather());
        Bound<Father>   fatherBound=new Bound<Father>(new Father());

        fatherBound.displayObj(grandFathers);
    }
}
class Bound<T extends GrandFather>
{
    private T objRef;

    public Bound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
    public void displayObj(List<? super Father> list){
        list.forEach((father)->{
            System.out.println(father.toString());
        });
    }
}


class GrandFather
{
    public void displayClass()
    {
        System.out.println("Inside super class GrandFather");
    }
}

class Father extends GrandFather
{
    public void displayClass()
    {
        System.out.println("Inside sub class Father");
    }
}

class Uncle extends GrandFather
{
    public void displayClass()
    {
        System.out.println("Inside sub class Uncle");
    }
}
class Child extends Father{
    public void displayClass()
    {
        System.out.println("Inside sub class Child");
    }
}
