package javaCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

        //Used to make a copy while more than one thread trying to access and modify this array
        //Normal arryalist will throw concurrent modification exception if more than one thread trying to access and modify
    }
}
