package OOPS.Practise_OOPS;

public class Practise_Static {
    static void main(String[] args) {
        CounterApp c1=new CounterApp();
        CounterApp c2=new CounterApp();
        CounterApp c3=new CounterApp();
        CounterApp c4=new CounterApp();

        System.out.println( "Obj count "+CounterApp.count );
    }
}
class CounterApp{
    static int count=0;
    public CounterApp(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
