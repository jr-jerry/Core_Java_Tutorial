package OOPS.Practise_OOPS;

public class Practise_Static {
    static void main(String[] args) {

    }
}
class CounterApp{
    static int count=0;
    public void increase(){
        count=count+1;
    }
    public CounterApp(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
