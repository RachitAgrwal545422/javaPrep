package Streams;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        //It takes input and do some operation on it but does not return anything
        Consumer<String> consumer = (s) -> System.out.println("Consumed: " + s);
        consumer.accept("Hello");
    }
}
