import javaCollections.ArrayListExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int func1(){
        return 1;
    }

    static class Compare implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //public :- is an access modifier and states that this method can be used outside the class and this class can be extended as well
        //static:- means this method is assosiated this class type and not with it's instances
        //args :- these are the command line arguments passed with JVM while converting byte code to machine code
        //System.out.println is being used for printing something on screen


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        double a = 4e2;
        boolean b = true;
        String c = "Hello";
        char d = c.charAt(0);
        int[] arr = {1,2,3,4,5};
        int [][] multiDimensionalArray = {{1,2,3},{2,3},{4,5,6,7}};


        //Intergers :- Byte(8 bits,-2^7,2^7+1),Short(16 bits,-2^15,2^15+1),Integer(32 bits,-2^31,2^31+1) ,Long(64 bits,-2^63,2^63+1)
        //Boolean:- bool
        //char :- 2 bytes
        //Float:- 32 bits
        //Double :- 64 bits

        // >> (Left Shift Operator) Fill Left most vacant bit with one and shift all bits to left
        // << (Right Shift Operator) Fill Right most vacant bit with zero and shift all bits to right
        //>>> (unSigned Left shift Operator) Fill Left most vacant bit with zero and shift all bits to left

        //~(negation) it is basically ones complement(Meaning 1 to 0 and 0 to 1)



//        JavaEnvironments javaEnvironments = new JavaEnvironments();

        ArrayList<String> list = new ArrayList<String>(List.of("Ok","Bye"));
        list.sort(Comparator.comparing(String::length).reversed().thenComparingInt(o -> o.charAt(0)));
        System.out.println(list);
    }
}