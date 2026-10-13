package Generics;

public class Class2 {
    static void main(String[] args) {
        Pair.static_method(12,"apple");
    }
}
class Pair<k,v>{
    public Pair( k key,v value) {
        this.value = value;
        this.key = key;
    }

    k key;
    v value;

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public void display(){
        System.out.println("key:"+key+"value:"+value);
    }

    public static <a,b> void static_method(a key,b value){
        System.out.println("from static_method key:"+key+"value:"+value);
    }

}
