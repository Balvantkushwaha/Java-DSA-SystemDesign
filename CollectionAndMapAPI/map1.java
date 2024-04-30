package PwskillJava.CollectionAndMapAPI;

import java.util.Hashtable;

public class map1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "balvant");
        // ht.put(2, "ramkishan");
        ht.put(3, "md ali ");

        // ht.put(null, "hariom"); null value not allow this method Hashtabel not allow
        // null value
        ht.putIfAbsent(2, "ramkishan");
        System.out.println(ht);
    }
}
