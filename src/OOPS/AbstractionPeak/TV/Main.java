package OOPS.AbstractionPeak.TV;

public class Main {
    static void main(String[] args) {
        Remote remoteObjRef=new SamsungRemote();
        remoteObjRef.powerOn();
        remoteObjRef.powerOff();
    }
}
