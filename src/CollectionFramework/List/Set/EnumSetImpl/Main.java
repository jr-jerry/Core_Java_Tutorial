package CollectionFramework.List.Set.EnumSetImpl;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
//        Set<String> nameSet=new HashSet<>();
//        nameSet.add("Car");
//        nameSet.add("Bike");
//        nameSet.add("Bicycle");
//        nameSet.add(null);
//        System.out.println(nameSet);
        Set<WeekDays> enumSet= EnumSet.noneOf(WeekDays.class);
        enumSet.add(WeekDays.MONDAY);
        enumSet.add(WeekDays.TUESDAY);
        enumSet.add(WeekDays.WEDNESDAY);
        enumSet.forEach(System.out::println);

    }
}
enum TrafficLights{
    RED, GREEN,YELLOW
}
enum WeekDays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
}
