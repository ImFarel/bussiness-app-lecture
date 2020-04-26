package KuliahPackage.TK3;

import java.util.*;

public class nomor3 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("1");
        s1.add("2");
        s1.add("3");
        s1.add("4");
        s1.add("5");

        Set<String> s2 = new HashSet<>();
        s2.add("5");
        s2.add("6");
        s2.add("7");
        s2.add("8");
        s2.add("9");
        s2.add("10");

        Set<String> union = new TreeSet<>(s1);
        union.addAll(s2); //untuk menggabungkan
        print("union", union);

        Set<String> intersect = new TreeSet<>(s1);
        intersect.retainAll(s2); //untuk interseksi
        print("intersect", intersect);

        Set<String> min = new TreeSet<>(s1);
        min.removeAll(s2);
        print("min", min);

        Set<String> himpunanBagian = new TreeSet<>(s1);
        himpunanBagian.containsAll(s2); //himpunan bagian
        print("himpuanan bagian", himpunanBagian);


    }

    protected static void print(String label, Collection<String> c) {
        System.out.println("--------------" + label + "--------------");
        for (String s : c) {
            System.out.println(s);
        }
    }
}
