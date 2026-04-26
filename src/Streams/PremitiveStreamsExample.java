package Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PremitiveStreamsExample {
    public static void main(String[] args) {
        //DOubleStream and IntStream are some examples of premitive streams
        DoubleStream doubleStream = DoubleStream.generate(Math::random).limit(10);
        doubleStream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 11);
        intStream.forEach(System.out::println);
    }
}
