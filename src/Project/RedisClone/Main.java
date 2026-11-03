package Project.RedisClone;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    static void main(String[] args) {
         TTLData obj1=new TTLData("gautam",System.currentTimeMillis()+(5*1000));

         ConcurrentHashMap<String,TTLData> map=new ConcurrentHashMap<String,TTLData>();
         map.put(obj1.getValue(),obj1);



    }
}
class CacheLvl2{
    private Map<String,TTLData> map=new HashMap<>();
    private ReadWriteLock readWriteLock;
    private ScheduledExecutorService executorService=Executors.newSingleThreadScheduledExecutor();

    public CacheLvl2(){
        readWriteLock=new ReentrantReadWriteLock();
        executorService.scheduleAtFixedRate(()->{
            Lock writeLock=readWriteLock.writeLock();
            writeLock.lock();

            try{
                Iterator<Map.Entry<String,TTLData>> iterator=map.entrySet().iterator();
                //Handle ConcurrentModification Exception
                while(iterator.hasNext()){
                    Map.Entry<String,TTLData> entry=iterator.next();
                    TTLData t=entry.getValue();
                    if(t.getExpiredTime()<System.currentTimeMillis()){
                        iterator.remove();
                    }
                }
            }finally {
                writeLock.unlock();
            }
        }, 0,5, TimeUnit.SECONDS);
    }
    public void addData(String key,String value,long time){

        Lock writeLock=readWriteLock.writeLock();
        writeLock.lock();

        try{
            map.put(key,new TTLData(value, System.currentTimeMillis()+(time*1000)));
            System.out.println("Current Thread "+Thread.currentThread().getName()+" write on map ");

        }finally{
            writeLock.unlock();
        }
    }
    public String getData(String key){
        Lock readLock=readWriteLock.readLock();
        readLock.lock();
        try{
            return map.get(key).getValue();
        }finally{
            readLock.unlock();
        }
    }
}
class TTLData{
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(long expiredTime) {
        this.expiredTime = expiredTime;
    }

    private String value;
    private long expiredTime;

    public TTLData(String value, long expiredTime) {
        this.value = value;
        this.expiredTime = expiredTime;
    }
}
class Cache{
    public ConcurrentHashMap<String, TTLData> getMap() {
        return map;
    }

    private ConcurrentHashMap<String,TTLData> map = new ConcurrentHashMap<>();
    private ScheduledExecutorService executorService=Executors.newSingleThreadScheduledExecutor();

    public Cache(){
        executorService.scheduleAtFixedRate(()->{
            map.forEach((k,v)->{
                boolean isExpired=v.getExpiredTime()<System.currentTimeMillis()?true:false;
                if(isExpired){
                    map.remove(k);
                }
            });
        },0, 5, TimeUnit.SECONDS);
    }
    public void shutDown(){
        executorService.shutdown();
    }
    public void add(String key,String value,int time){
        map.put(key,new TTLData(value,System.currentTimeMillis()+time*1000));
    }
    public String get(String key){
        TTLData data=map.get(key);
        if(data==null)return null;
        String isExpired= data.getExpiredTime()<System.currentTimeMillis()?"Expired":"Not expired";
        if(isExpired.equals("Expired")){
            map.remove(key);
            return "expired";
        }else{
            return data.getValue();
        }
    }
}