package Generics;

public class Class4 {
    static void main() {
        SpecialBox<Integer> specialBox=new SpecialBox<Integer>(5);
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
