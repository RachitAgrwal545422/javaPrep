package Generics;

import java.util.ArrayList;

public class Practice {
    static class Box<T> {
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public T multiply(T value) {
            return value;
        }
    }

    static class Pair<T,V>  {
        private T key;
        private V value;

        public void setKey(T key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
        public T getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return getKey() + ": " + getValue();
        }
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("Integer value: " + integerBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String value: " + stringBox.getValue());

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Generics");
        stringList.add("are");
        stringList.add("powerful!");
        System.out.println("String List: " + stringList);

        Box<Integer>[] arr = new Box[3];
        arr[0] = integerBox;
        int a = arr[0].multiply(5);
        System.out.println("Multiplication result: " + a);

        Pair<Integer, String> pair = new Pair<>();
        pair.setKey(a);
        pair.setValue("Hello, Generics!");
        System.out.println("Pair result: " + pair);
    }
}
