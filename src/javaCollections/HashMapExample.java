package javaCollections;

import java.util.HashMap;
public class HashMapExample {
    class Person{
        int age;
        String name;

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" + "age=" + age + ", name=" + name + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            return false;
        }

        @Override
        public int hashCode() {
            return age + name.hashCode();
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
