package Generics;

public class Practise2 {
    static void main() {
        Box1<Integer,Character,Float,Double> box1=new Box1<>(4,'c',23.1f,12.021);
//        System.out.println(box1);
        Box1<String,Integer,Double,Boolean> box2=new Box1<>("gautam",12,1.23,true);
//        System.out.println(box2);

        Box1.display(12,'c',123.2f,true);
    }
}
class Box1<a,b,c,d>{
    public Box1(a field1, b field2, c field3, d field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    a field1;
    b field2;
    c field3;
    d field4;
    // static method display
    public static <t1,t2,t3,t4> void  display(t1 field1, t2 field2, t3 field3, t4 field4) {
        System.out.println("field 1"+field1+" field 2"+field2+" field 3"+field3+" field4"+field4);
    }
}
//--> box ( 4 container ) -->2 box