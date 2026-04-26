package Streams;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        //It does not take any input but returns some output
        Supplier<String> supplier = () -> "Hello from Supplier!";
        System.out.println(supplier.get());
    }
}
