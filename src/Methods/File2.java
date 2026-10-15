package Methods;

public class File2 {
    static void main(String[] args) {
        File2 f2=new File2();
       f2.method1();
    }
    private void method1(){
        System.out.println("method1 call of File2 Class");
    }
    public void method2(){
        method1();
    }
}
class File3{
    static void main() {
        File2 file2_obj=new File2();
        file2_obj.method2();
    }
}