package API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        //  List<Integer> list1 = new ArrayList<Integer>();
        //  list1.add(2);
        //  list1.add(4);
        //  list1.add(5);
        //  list1.add(8);
        //  System.out.println(list1);
         List<Integer> list2 = Arrays.asList(2,4,5,8,9);
         System.out.println(list2);
         for(Integer i:list2){
            System.out.println(i);
         }
         
        list2.forEach(i->System.out.println(i));
         


    }
}
