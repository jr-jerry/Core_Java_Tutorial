package Generics;

public class Class3 {
    static void main() {
        Box<Integer> box1=new Box<Integer>(10);
        Box<Double> box3=new Box<Double>(12.21);
        Box<Float> box4=new Box<Float>(12.2f);

        Box<String> box2=new Box<String>("Hello");
        Box<Boolean> box5=new Box<Boolean>(true);
    }
}
//UpperBound Generic
class Box<T extends Number>{
    T value;
    public Box(T value) {
        this.value = value;
    }
}

