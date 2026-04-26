package Streams;

import java.util.stream.IntStream;

public class PrallelStreamsExample {
    public static void main(String[] args) {
        //A type of stream that enables parallel processing of elements which reduces time drastically(not everytime, depends on input and machine cores)
        //Using parallel stream to process a list of numbers
        long startTime = System.currentTimeMillis();
        int count = Math.toIntExact(IntStream.range(1, 100000000)
                .parallel() // Enable parallel processing
                .count());
        long endTime = System.currentTimeMillis();
        System.out.println("Sum with parallel operation: " + count);
        System.out.println("Time taken with parallel operation:: " + (endTime - startTime) + " ms");
        //Without Using parallel
        long startTimeWithoutParallel = System.currentTimeMillis();
        int countWithoutParallel = Math.toIntExact(IntStream.range(1, 100000000)
                .count());
        long endTimeWithoutParallel = System.currentTimeMillis();
        System.out.println("Sum without parallel operation: " + countWithoutParallel);
        System.out.println("Time taken without parallel operation:: " + (endTimeWithoutParallel - startTimeWithoutParallel) + " ms");
    }
}
