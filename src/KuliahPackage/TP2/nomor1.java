package KuliahPackage.TP2;

import java.util.Scanner;

/**
 * Anda diminta untuk membuat program yang menerima input
 * berupa nilai panjang, lebar dan tinggi berupa angka positif.
 * Jika nilai input berupa angka negative maka akan dilakukan exception.
 */
public class nomor1 {
    private static double panjang, lebar, tinggi;

    public static void doCalculation() {
        System.out.println("\nHasi Luas ("
                + panjang + "*" + lebar + "*" + tinggi + ") : "
                + (panjang * lebar * tinggi)
        );
    }

    public static void setPanjang(double panjang) throws IllegalArgumentException {
        if (panjang >= 0) {
            nomor1.panjang = panjang;
        } else {
            throw new IllegalArgumentException("Panjang tidak boleh kurang dari 0");
        }
    }

    private static void setLebar(double lebar) throws IllegalArgumentException {
        if (lebar >= 0) {
            nomor1.lebar = lebar;
        } else {
            throw new IllegalArgumentException("Lebar tidak boleh kurang dari 0");
        }
    }

    private static void setTinggi(double tinggi) throws IllegalArgumentException {
        if (tinggi >= 0) {
            nomor1.tinggi = tinggi;
        } else {
            throw new IllegalArgumentException("Tinggi tidak boleh kurang dari 0");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Luas persegi (Panjang x Lebar x Tinggi)");
        System.out.println("=====================================");
        try {
            System.out.print("> Masukan jumlah panjang: ");
            setPanjang(sc.nextDouble());

            System.out.print("> Masukan jumlah lebar: ");
            setLebar(sc.nextDouble());

            System.out.print("> Masukan jumlah tinggi: ");
            setTinggi(sc.nextDouble());

            doCalculation();
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}
