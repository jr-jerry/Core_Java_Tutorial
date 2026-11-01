package OOPS.AbstractionPeak;

public class Introduction {
    static void main(String[] args) {
        Calculation calculationObjRef=new CalculateImpl();
        System.out.println(calculationObjRef.isSumOdd(1,2));
    }
}
