package javaCollections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        //Extends the hashMap itself
        //Keep the order of insertion
        //made using doubly linked list

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
        //access Order is false means maintain the insertion order
        //access Order is true means recently accessed will automatically moved to end
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>(16, 0.75f, true);


    }
}
