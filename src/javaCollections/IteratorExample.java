package javaCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
            //An iterator is an object that provides a way to access the elements of a collection sequentially without exposing the underlying structure of the collection. It allows you to traverse through the elements of a collection, such as a list or a set, and perform operations on them.

            //In Java, the Iterator interface is part of the java.util package and provides methods for iterating over collections. The main methods of the Iterator interface include:

            //hasNext(): Returns true if there are more elements to iterate over.
            //next(): Returns the next element in the iteration.
            //remove(): Removes the last element returned by the iterator (optional operation).

            //Example usage:
            List<String> list = Arrays.asList("a", "b", "c");
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }
    }
}
