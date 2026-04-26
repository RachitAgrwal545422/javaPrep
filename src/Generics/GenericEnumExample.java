package Generics;
enum Color {
    RED, GREEN, BLUE;

    <T extends String> void getValue(T value) {
        System.out.println(this.name() + ":" + value);
    }
}
public class GenericEnumExample {
    public static void main(String[] args) {
        //Enums are by default type safe
        Color[] colors = Color.class.getEnumConstants();
        for (Color color : colors) {
            System.out.println(color);
            color.getValue("hello"); // Output: Hello
        }
    }
}
