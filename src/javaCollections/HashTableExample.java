package javaCollections;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        //Similar to hash map
        //Synchronized and thread safe
        //Does not allow null key and null value
        //No Treefy Stuff and only linked list
        //locking overhead is there as there is locking process in every read and write
        Hashtable<Integer, String> hashtable = new Hashtable<>(20,0.2f);

        hashtable.put(1,"a");
        hashtable.put(2,"b");
        hashtable.put(3,"c");
        hashtable.put(4,"d");
        hashtable.put(5,"e");

    }
}
