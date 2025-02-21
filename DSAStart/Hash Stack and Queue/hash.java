import java.util.HashMap;
import java.util.Map;

public class hash{
    public static void main(String[] args) {
         HashMap<Integer,String> hashmap = new HashMap<>();
         // functionality fof the pub function 
         hashmap.put(1,"Priya");
         hashmap.put(2,"Balvant");
         hashmap.put(3,"hariom");
         hashmap.put(4,"Jeetendra");
         System.out.println("Hashmap of the give data is "+hashmap);
         // functionality of the get function
         String result = hashmap.get(3);
         System.out.println("value for the given key is:"+result);

         // functionality of the remove() function 
         hashmap.remove(1);
         System.out.println("Updated hashmap:"+hashmap);
         //functionality of the containsKey
         System.out.println(hashmap.containsKey(2));
         // iteration using the for loop
          for(Map.Entry<Integer,String> e:hashmap.entrySet()){
             System.out.println("hashmap is:"+e.getKey()+":"+e.getValue());
          }


    }
}