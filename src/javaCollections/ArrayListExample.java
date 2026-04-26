package javaCollections;

import java.util.*;

public class ArrayListExample {

    public static class Compare implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    ArrayListExample() {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(2, 3, 1, 5, 4));
        list.set(0, 1);
        list.add(1, 2);
        list.sort(new Compare());

    }


}
