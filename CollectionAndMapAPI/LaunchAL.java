package CollectionAndMapAPI;

import java.util.ArrayList;

public class LaunchAL {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(100);
        al1.add(200); // Homognius data
        al1.add(300);
        System.out.println(al1);
        System.out.println("**************************");
        ArrayList al2 = new ArrayList<>();
        al2.add("pw skill");
        al2.add('j');
        al2.add(2); // Hetrognius data
        al2.add(2.2);
        System.out.println(al2);
        System.out.println("****************************");
        // add homognius data
        ArrayList al3 = new ArrayList<>();
        al3.addAll(al1);
        System.out.println(al3);
        al3.add(0, "3");
        System.out.println(al2);

    }
}
