package Methods.CallByRef;

public class Main {
    static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        System.out.println(array);

        Main m=new Main();
        System.out.println(m);
        System.out.println("array before calling method ");
        for(int i=0;i<array.length;i++){
            System.out.println("original array "+array[i]);
        }
        m.method(array);

        System.out.println("array after calling method ");
        for(int i=0;i<array.length;i++){
            System.out.println("original array "+array[i]);

        }
    }
    public void method(int[] arr){
        arr[0]=111;
        for(int i=0;i<arr.length;i++){
            System.out.println("dummy arr "+arr[i]);
        }
    }
}
