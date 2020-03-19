package KuliahPackage.TP1;

import java.util.Scanner;

public class nomor4 {
    /**
     * Balok Resolver
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Volume Balok Resolver\n=====================");

        System.out.print("Masukan Panjang (cm): ");
        int panjang = sc.nextInt();

        System.out.print("Masukan Lebar (cm): ");
        int lebar = sc.nextInt();

        System.out.print("Masukan Tinggi (cm): ");
        int tinggi = sc.nextInt();

        int totalVolume = panjang * lebar * tinggi;

        String template = "Total volume balok => Panjang (%s) × Lebar (%s) × Tinggi (%s) = %s";
        String output = String.format(template, panjang, lebar, tinggi, totalVolume);
        System.out.println(output);
    }
}
