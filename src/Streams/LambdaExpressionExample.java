package Streams;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        //Anonymous method with no name, no return type and no access modifiers
        //just takes input and performs some operation on it
        //Lambda expression is used to pass in place of a functional interface
        //Example :-
             Runnable runnable = () -> System.out.println("Hello World");
             runnable.run();
        //A functional interface has no more than one abstract method, but it can have multiple default and static methods
             Runnable runnable1 = new Runnable() {
                 @Override
                 public void run() {
                     System.out.println("Hello World");
                 }
             };
             runnable1.run();
    }
}
