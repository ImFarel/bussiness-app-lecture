package KuliahPackage.TK3;

public class nomor1 {
    public static void main(String[] args) {
        int d, a;

        try { // memonitor sebuah blok kode.
            d = 0;
            a = 42 / d;
            System.out.println("Ini tidak akan ditampilkan.");
        } catch (ArithmeticException e) { // menangkap error pembagian nol
            System.out.println("Pembagian oleh nol.");
        }

        System.out.println("Setelah statemen catch.");

    }
}
