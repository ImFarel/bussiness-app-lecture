package KuliahPackage.TP2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bilangan = new int[3];

        System.out.println("============= min max =============");
        System.out.print("> Bilangan ke-1 : ");
        bilangan[0] = sc.nextInt();
        System.out.print("> Bilangan ke-2 : ");
        bilangan[1] = sc.nextInt();
        System.out.print("> Bilangan ke-3 : ");
        bilangan[2] = sc.nextInt();

        Arrays.sort(bilangan);
        System.out.printf("Bilangan terbesar : %s\n", bilangan[2]);
        System.out.printf("Bilangan terkecil : %s\n", bilangan[0]);
    }
}
