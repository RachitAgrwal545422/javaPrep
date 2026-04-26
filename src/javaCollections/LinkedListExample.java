package javaCollections;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Integer a = list.get(1);
        System.out.println(a);

    }
}
