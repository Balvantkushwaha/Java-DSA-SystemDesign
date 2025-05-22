package API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class MoreSTR {
    public static void main(String[] args) {
         List<Integer> list= Arrays.asList(8,4,2,7,5);
         Stream<Integer> streamData = list.stream();
         //long count = streamData.stream();
       //  System.out.println(count);
       /*Stream<Integer> sortedStream = streamData.sorted();
       Stream<Integer> mapStream = sortedStream.map(n->n*2);
       mapStream.forEach(n->System.out.println(n));*/

       // Lambda expresss 
       Predicate<Integer> pre = i->i%2==0;
       Stream<Integer> finalStream = streamData
       .filter(n->n%2==0) // pre can use
       .sorted()
       .map(n->n*3);
       finalStream.forEach(n->System.out.println(n));

    }
}
