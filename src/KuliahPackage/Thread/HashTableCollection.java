package KuliahPackage.Thread;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableCollection {
    public static void main (String[]args){
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration<String> e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}