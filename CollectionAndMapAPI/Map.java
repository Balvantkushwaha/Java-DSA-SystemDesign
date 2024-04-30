package PwskillJava.CollectionAndMapAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map {
    public static void main(String[] args) {
        HashMap sm = new HashMap();
        sm.put(01, "Balvant");
        sm.put(04, "Balvant  ");
        sm.put(02, "ramkishan");
        sm.put(null, null);
        System.out.println(sm);

        sm.put("mahraja", "Balvant");
        sm.put("peera ", "Balvant  ");
        sm.put("chhatrpur", "ramkishan");
        System.out.println(sm);
        LinkedHashMap Lh = new LinkedHashMap();
        Lh.put("A", "balvnat");
        Lh.put("B", "ramkishan");
        Lh.put("C", "Hariom");
        System.out.println(Lh);

    }
}
