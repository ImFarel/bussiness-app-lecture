package KuliahPackage.TK1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Input panjang deret (n) = ");

        n = Integer.parseInt(sc.nextLine());
        System.out.print("Input bilangan (pisahkan dengan ' ' (spasi)) = ");
        String[] arr_bilangan = sc.nextLine().split(" ");

        if (arr_bilangan.length > n) {
            System.out.println(
                    "Deret bilangan yang di input melebihi batas," +
                            "maka yang kelebihan akan di potong"
            );
        }

        Integer[] int_arr_bilangan = toIntegerArrays(n, arr_bilangan);

        int min = Collections.min(Arrays.asList(int_arr_bilangan));
        int max = Collections.max(Arrays.asList(int_arr_bilangan));

        System.out.println("Nilai minimum => " + min);
        System.out.println("Nilai maksimum => " + max);
        System.out.println("Nilai median => "
                + Math.round(findMedian(int_arr_bilangan))
        );

    }

    private static double findMedian(Integer[] a) {
        int n = a.length;
        Arrays.sort(a);

        // kalo genap
        if (n % 2 != 0)
            return (double) a[n / 2];

        return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;

    }

    private static Integer[] toIntegerArrays(
            int n,
            String[] arr_bilangan
    ) {
        Integer[] int_arr_bilangan = new Integer[n];

        for (int i = 0; i < n; i++) {
            int_arr_bilangan[i] = Integer.parseInt(arr_bilangan[i]);
        }
        return int_arr_bilangan;
    }
}