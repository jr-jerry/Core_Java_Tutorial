package Methods;

public class File2 {
    static void main(String[] args) {
        File2 f2=new File2();

        int v1=10;
        int v2=20;

        int res= f2.sum(v1,v2);
        System.out.println("v1: "+v1+" v2: "+v2);
        System.out.println(res);
    }
    public int sum(int a,int b){
        a=20;
        return a+b;
    }
}
