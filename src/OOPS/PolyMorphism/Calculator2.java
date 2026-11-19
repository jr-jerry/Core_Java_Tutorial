package OOPS.PolyMorphism;

public class Calculator2 {
    public double sum(double a,double b){
        return a+b;
    }
    public double sum(int a,double b){
        return a+b;
    }

    static void main(String[] args) {
       Calculator2 calculator2=new Calculator2();
        calculator2.sum(4.4,1.5);
    }
}
