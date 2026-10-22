package CollectionFramework.List.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Index {
    static void main() throws InterruptedException {
        ResourceVector resourceArrayList = new ResourceVector();
        Thread thread0=new Thread(()->{
            for(int i=1;i<=10000;i++){
                resourceArrayList.add();
            }
        });
        Thread thread1=new Thread(()->{
            for(int i=1;i<=10000;i++){
                resourceArrayList.add();
            }
        });
        thread0.start();
        thread1.start();
        //main thread please wait unitll thread0 complete its task
        thread0.join();
        thread1.join();

//        System.out.println("ResourceArrayList : list size :"+resourceArrayList.get().size());
        System.out.println("ResourceVectorList : list size :"+resourceArrayList.get().size());

    }
}
class ResourceArrayList{
    private List<Integer> list;
    public ResourceArrayList(){
        list = new ArrayList<>();
    }
    public void add(){
        list.add(1);
    }
    public List<Integer> get(){
        return this.list;
    }
}
class ResourceVector{
    private List<Integer> list;
    public ResourceVector(){
        list = new Vector<>();
    }
    public void add(){
        list.add(1);
    }
    public List<Integer> get(){
        return this.list;
    }
}