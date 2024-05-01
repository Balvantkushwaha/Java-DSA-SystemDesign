package Generics;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class gen4Collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(50);
        al.add(40);
        al.add(60);
        al.add(30);
        al.add(70);
        al.add(80);
        System.out.println(al);

        // collection sort
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("balvant");
        al2.add("Hyder");
        al2.add("Pw");
        al2.add("java");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(50);
        al3.add(40);
        al3.add(60);
        al3.add(30);
        al3.add(70);
        al3.add(80);
        System.out.println(al3);
        int index = Collections.binarySearch(al3, 600);
        System.out.println(index);
        Collections.rotate(al3, 3);
        System.out.println(al3);
        int index1 = Collections.frequency(al3, 30);
        System.out.println(index1);

    }
}
