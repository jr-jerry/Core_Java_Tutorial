package OOPS.AbstractionPeak;

public class CalculateImpl extends Calculation {
    @Override
    public boolean isSumOdd(int a,int b) {
        int t=a+b;
        if(t%2==1){
            return true;
        }else {
            return false;
        }
    }
}
