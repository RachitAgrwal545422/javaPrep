package Streams;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //This helps us create functions using lambda expression
        //We can have 2 objects :- One for input and one for output
        //If output of one function is input of another function then we can use andThen() method to combine them
        //Example :-
            Function<Integer,Integer> square = (n) -> n * n;
            Function<Integer,Integer> doubleIt = (n) -> n * 2;
            System.out.println(square.andThen(doubleIt).apply(20)); // Output: 800
    }
}
