package PwskillJava.CollectionAndMapAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteeratorListIterator {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);
        System.out.println(a1);
        /*
         * // System.out.println(a1.size());
         * // for
         * for (int i = 0; i < a1.size(); i++) {
         * Object O = a1.get(i);
         * System.out.println(O);
         * }
         * // foreach
         * for (Object o : a1) {
         * System.out.println(o);
         * }
         * 
         * 
         **/
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            /// Integer i =(Integer)itr.next();
            System.out.println(itr.next());
        }

        ListIterator itra = a1.listIterator(a1.size());
        while (itra.hasPrevious()) {
            // Integer i = (Integer) itra.previous();
            // System.out.println(i);
            System.out.println(itra.previous());
        }
    }
}
