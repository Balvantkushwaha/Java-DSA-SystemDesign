import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesOfMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"priya");
        map.put(1,"ajay");
        map.put(7,"balvnat");
        map.put(5,"hariom");
        System.out.println("HashMap map looks like:"+map);

        //Order fo insertion retained linked HashMap 
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(3,"priya");
        map1.put(1,"ajay");
        map1.put(7,"balvnat");
        map1.put(5,"hariom");
        System.out.println("LinkedHashMap map looks like:"+map1);

        // sorted output on the basis of teh keys 

        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(3,"priya");
        map2.put(1,"ajay");
        map2.put(7,"balvnat");
        map2.put(5,"hariom");
        System.out.println("TreeMap map looks like:"+map2);
    }
}
