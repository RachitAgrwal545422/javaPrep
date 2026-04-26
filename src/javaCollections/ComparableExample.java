package javaCollections;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparableExample {
    static class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name=name;
            this.age=age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 35));

        people.sort(Comparator.comparing((Person o) -> o.name));
    }
}
