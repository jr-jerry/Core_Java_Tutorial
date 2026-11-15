package OOPS.AbstractionPeak;

public class CalCulateImpl2 extends  Calculation{
    @Override
    public boolean isSumOdd(int a, int b) {
        int t=a+b;
        if(t%2!=0){
            return true;
        }else{
            return false;
        }
    }
}
