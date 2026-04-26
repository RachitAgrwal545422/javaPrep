package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
            //Collectors are used to collect the result of a stream operation into a collection or other data structure
            //For example, we can use Collectors to collect the result of a stream operation into a List
            List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());

            ArrayDeque<String> deque = Stream.of("a", "b", "c").collect(Collectors.toCollection(()->new ArrayDeque<>()));

            String combined = deque.stream().collect(Collectors.joining(",","",""));
            System.out.println("Combined string: " + combined);

           IntSummaryStatistics summary =  Stream.of(1,2,3,4,5).collect(Collectors.summarizingInt(Integer::intValue));
           System.out.println("Summary statistics: " + summary);

           //There are so many options in collectors so as u use them so u learn them
           //no need to remember everything


          String words = "Hello How Are you Hello Hello How Are you";
          Arrays.stream(words.split(" ")).collect(Collectors.groupingBy(String::length,Collectors.toSet())).forEach((k, v)->{
              System.out.println(k + " : " + v);
          });


          Stream.of(1,2,3,4,5,6).collect(Collectors.partitioningBy(n->n%2 == 0,Collectors.toSet())).forEach((k, v)->{;
              System.out.println(k + " : " + v);
          });

         HashMap<Integer, Integer> map = new HashMap<>();
         Stream.of(1,2,3,4,5,6).forEach(i->{
            map.put(i,map.getOrDefault(i,0) + 1);
         });
         System.out.println(map);
    }
}
