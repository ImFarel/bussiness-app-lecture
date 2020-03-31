package KuliahPackage.TK2;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        boolean toCacth = false;
        Scanner sc = new Scanner(System.in);
        Integer faktor = 0;
        Integer gaji = 1500000;
        int totalGaji = 0;

        System.out.println("Hitung Gaji Univ Lorem Ipsum");
        System.out.println("============================");
        System.out.print("Input Nama : ");
        String nama = sc.nextLine();

        String golongan[] = {"Dosen", "Staff"};
        int num;
        do {
            System.out.print("Golongan pegawai (Dosen [0] / Staff [1]): ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n re-enter (Dosen [0] / Staff [1]) : ", input);
            }
            num = sc.nextInt();
        } while (num > 2);

        switch (num) {
            case 0: {
                System.out.println("Jumlah SKS yang diampu : ");
                faktor = sc.nextInt();
                totalGaji = (faktor * 300000) + gaji;
                System.out.println(nama + " mendapat gaji " + totalGaji);
                break;
            }
            case 1: {
                System.out.println("Jumlah Kehadiran tiap bulan : ");
                faktor = sc.nextInt();
                totalGaji = (faktor * 150000) + gaji;
                System.out.println(nama + " mendapat gaji " + totalGaji);
                break;
            }
        }
    }

}
