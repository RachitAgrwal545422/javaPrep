package javaCollections;

import java.lang.ref.WeakReference;
import java.util.Map;

public class WeakReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        WeakReference<String> weakRef = new WeakReference<>(new String("Hello, World!"));
        System.out.println(weakRef.get());

        System.gc();
        Thread.sleep(10000);

        System.out.println(weakRef.get());
    }
}
