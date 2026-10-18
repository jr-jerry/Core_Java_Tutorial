package OOPS.Practise_OOPS;

public class Practise_Static {
    static void main(String[] args) {
        CounterApp c1=new CounterApp();
        CounterApp c2=new CounterApp();

        c1.increase();
        c2.increase();
        c1.increase();

        System.out.println("c2: "+c2.getCount()+" c1: "+c1.getCount() );


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
