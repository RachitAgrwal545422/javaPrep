package Streams;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //A Predicate is a functional interface in Java that represents a boolean-valued function of one argument. It is used to test whether a given input satisfies a certain condition or not. The Predicate interface has a single abstract method called test() that takes an argument and returns a boolean value.

        //Example :-
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(5)); // Output: false

        CheckLimit checkLimit =  new CheckLimit();
        System.out.println(checkLimit.test(6));
        System.out.println(checkLimit.test(31));
    }

    static class CheckLimit implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            return integer >= 30;
        }
    }
}
