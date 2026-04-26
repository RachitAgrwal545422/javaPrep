package javaCollections;

import java.util.EnumMap;

public class EnumMapExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        //Suppose you want keys of a hashMap based on a enum values
        //Not so thread safe
        EnumMap<Day, String> enumMap = new EnumMap<Day, String>(Day.class);

        enumMap.put(Day.MONDAY, "Monday");
        enumMap.put(Day.TUESDAY, "Tuesday");
        enumMap.put(Day.WEDNESDAY, "Wednesday");
        enumMap.put(Day.THURSDAY, "Thursday");
        enumMap.put(Day.FRIDAY, "Friday");
        enumMap.put(Day.SATURDAY, "Saturday");

        //It is faster than other hashmaps
    }
}
