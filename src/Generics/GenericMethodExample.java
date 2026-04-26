package Generics;

public class GenericMethodExample {
    static <T extends Number> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printArray(String [] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"a", "b", "c"});
        printArray(new Double[]{1.2,2.3,3.4});
    }
}
