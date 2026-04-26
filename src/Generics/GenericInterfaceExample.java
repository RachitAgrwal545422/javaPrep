package Generics;

public class GenericInterfaceExample {

    //We can use & operator in such a way that T extends class1 & interface1 &interface2 ...
    //if then are any class1 then use it first and then other interfaces
    //We can not have more than one class here
    @FunctionalInterface
    interface Multipliable<T extends Number & Comparable<T>> {
        T getValue(T value, int number);
    }

    static class DoubleIt implements Multipliable<Integer> {
        @Override
        public Integer getValue(Integer value, int number) {
            return value * number;
        }
    }

    public static void main(String[] args) {
        Multipliable<Double> doubleMultipliable = (value, number) -> value * number;
        System.out.println("Double value: " + doubleMultipliable.getValue(5.5, 2)); // Output: Double value: 11.0
    }
}

