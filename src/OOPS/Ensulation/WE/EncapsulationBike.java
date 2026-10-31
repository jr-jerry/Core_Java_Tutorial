package OOPS.Ensulation.WE;

public class EncapsulationBike {
    static void main(String[] args) {
        Bike12 ZmrBikeRef=new Bike12();
        ZmrBikeRef.setEngine("4v-Engine");
        ZmrBikeRef.setTire(2);

        System.out.println(ZmrBikeRef.getEngine()+" "+ZmrBikeRef.getTire());

        ZmrBikeRef.setEngine("8v-Engine");
        System.out.println(ZmrBikeRef.getEngine()+" "+ZmrBikeRef.getTire());
    }
}
class Bike12{
    private String engine;

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    private int tire;

    public String getEngine(){
        return engine;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
}
