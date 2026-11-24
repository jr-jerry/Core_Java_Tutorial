package CollectionFramework.SET;

import java.util.*;
enum TrafficLight{
    RED,
    GREEN,
    YELLOW,
}
public class LinkedHashSEt {
    static void main(String[] args) {
        EnumSet<TrafficLight> set=EnumSet.noneOf(TrafficLight.class);

        set.add(TrafficLight.RED);
    }
}
