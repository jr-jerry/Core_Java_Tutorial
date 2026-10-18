package Generics;

public class Class4 {
    static void main() {
        SpecialBox<Integer> specialBox=new SpecialBox<Integer>(5);
        SpecialBox<Double> specialBox1=new SpecialBox<Double>(5.01);
        SpecialBox<Number> specialBox2=new SpecialBox<Number>(5.23);

//        SpecialBox<String> specialBox3=new SpecialBox<String>("gautam");
    }
}
class SpecialBox<T extends Number>{
    Number item;
    public SpecialBox(Number item){
        this.item=item;
    }
    public Number getItem(){
        return item;
    }
}
