package Streams;

import jdk.dynalink.Operation;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        //Terminal operations are operations that produce a result or a side-effect and mark the end of a stream pipeline.
        //Examples of terminal operations include forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny, etc.
        //Terminal operations are eager and trigger the processing of the stream pipeline.
        //Example: Count the number of even numbers in a list
        long count = Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + count);

        //Optional Type can be used for null checking to avoid Accessing null values and getting NullPointerException
        Optional<Integer> sumOf10nums = Stream.iterate(1, n -> n + 1).limit(10).reduce(0, Integer::sum).describeConstable();
        System.out.println(sumOf10nums.isPresent() ? sumOf10nums.get() : "No value");

        Object[] arr = {"1",1,2,"3","Aman"};
        int sum = Arrays.stream(arr).filter(o -> o instanceof Integer)
                .mapToInt(o -> (Integer) o)
                .sum();
        System.out.println("Sum of integers in the array: " + sum);

        String str = "Hello from String!";
        long countL = str.chars().filter((i) -> ((char)i == 'l')).count();
        System.out.println("Count of 'l': " + countL);
    }
}
