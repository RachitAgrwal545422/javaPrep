package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
            //Streams are used to process collections of objects in a functional style
            //They can be used to perform operations like filter, map, reduce, etc.
            //They are lazy and can be parallelized for better performance
            //Source -> intermediate operations -> terminal operation
            //Example: Filter and print even numbers from a list
            List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).toList();
            System.out.println(numbers);

            int count = Math.toIntExact(Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).count());
            System.out.println("Count of even numbers: " + count);

            String[] arr = {"1","2","3","4","5"};
            int evenNumbersCount = Stream.of(arr).filter(s -> Integer.parseInt(s) % 2 == 0).toList().size();
            System.out.println("Count of even numbers: " + evenNumbersCount);

            //prints numbers from 1 to 10
            Stream.iterate(1, n -> n + 1).limit(20).forEach(System.out::println);

            List<Integer> nums = Stream.generate(() -> (int)(Math.random() * 100)).limit(10).toList();
            System.out.println(nums);

            //FlatMap :- It converts nested lists or nested arrays into single stream and then we can perform action on it
            //They can be transformed and flattened at the same time
            List<List<Integer>> nestedList = Arrays.asList(
                    Arrays.asList(1, 2, 3),
                    Arrays.asList(4, 5, 6),
                    Arrays.asList(7, 8, 9)
            );
            List<Integer> flatList = nestedList.stream()
                    .flatMap((list) -> list.stream()) // Flatten the nested lists into a single stream
                    .toList();
            System.out.println(flatList);

            //A stream can not be used once a terminal operation is callled and will through an exceptiom
            //Once u call a terminal operation that means stream is closed

            //ForEachOrdered must be used with parallel stream in case we need to do some operation on elements
            //internally parallely stream will devide elements into parts and assign to different threads
            Stream.of(1,2,3,4,5,56,6).parallel().forEach(System.out::print);//Random Order
            System.out.println();
            Stream.of(1,2,3,4,5,56,6).parallel().forEachOrdered(System.out::print);//Fixed Order
    }
}
