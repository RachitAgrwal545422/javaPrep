package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsExample {

    static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    static void print(ArrayList<?> array) {
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> arr =  new ArrayList<>();
        arr.add("2");
        arr.add("1");
        print(arr);

        System.out.println(sum(List.of(1,2,3,4)));
    }
}
