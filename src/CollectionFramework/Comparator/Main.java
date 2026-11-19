package CollectionFramework.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    static void main(String[] args) {
        Car001 bmw=new Car001(100,5);
        Car001 nano=new Car001(5,15);

        TreeSet<Car001> treeSet=new TreeSet<>();
        treeSet.add(bmw);//.add(5)
        treeSet.add(nano);//.add(1);

        System.out.println(treeSet);

    }
}
class Car001 implements Comparable<Car001>{
    private double price;

    @Override
    public String toString() {
        return "Car001{" +
                "price=" + price +
                ", length=" + length +
                '}';
    }
    private int length;
    public Car001(double price, int length) {
        this.price = price;
        this.length = length;
    }
    @Override
    public int compareTo(Car001 o) {
        return Double.compare(this.price, o.price);
    }
}
