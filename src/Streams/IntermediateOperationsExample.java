package Streams;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        //They are lazy and returns another streams
        //Need to collect them to get the result
        //In this example map, filter , sorted returns another stream which is collected using toList
         List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Alice", "Bob", "Charlie","Alice","Aman");
         List<String> filteredNames = names.stream()
                 .filter(name -> name.startsWith("A"))
                 .map(String::toUpperCase)
                 .skip(1)//skip one element (First one)
                 .distinct()
                 .sorted(String::compareTo)
                 .toList();
         System.out.println(filteredNames); // Output: [ALICE]
    }
}
