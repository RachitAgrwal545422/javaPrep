package javaCollections;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //Extends SortedMap Interface -> Naviagble Map Interface -> TreeMap Class
        //SortedMap Gives it the properties of being sorted
        //Navigable Map gives it the properties of navigating
        //A comparator can be passed as an argument which will be used while sorting the keys else it can be sorted in natural increasing order
        TreeMap<Integer, String> treeMap = new TreeMap<>(Integer::compareTo);
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");

        System.out.println(treeMap); // Output: {1=one, 2=two, 3=three}

        //Navigable Map Methods
        System.out.println(treeMap.firstKey()); // Output: 1
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.headMap(2, true));
        System.out.println(treeMap.tailMap(2, true));


    }
}
