public class StringExamples {
    public static void main(String[] args) {
        //Strings are immutable and everytime when we concat then a new string gets created which is not so efficient
        //As a result we use string builder or string buffer
        //string builder is same as string buffer but string builder is not thread safe and works badly in multithreading environment
        //For single threading environment String builder is better than string buffer
        //String Builder and Buffer are mutable
        //String is storing data in String pool and String Buffer and String Builder are storing data inside Heap memory
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        stringBuilder.append("!");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        stringBuffer.append("!");
        System.out.println(stringBuffer);
        int b = 20;
        Integer a = b;
        System.out.println(b);
        System.out.println(a);
    }
}
