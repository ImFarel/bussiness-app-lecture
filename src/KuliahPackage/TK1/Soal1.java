package KuliahPackage.TK1;

public class Soal1 {
    public static void main(String[] args) {
        String A = "Saya Programmer Java";
        String B = "Saya suka Pemrograman";

        System.out.println("=============================================");
        //a.	Mengubah huruf kecil menjadi huruf besar
        questionVariable(A, B);
        System.out.println("a.\tMengubah huruf kecil menjadi huruf besar");
        System.out.println(getToUpperCase(A));
        System.out.println(getToUpperCase(B));
        System.out.println("=============================================");

        //b.	Mengubah huruf besar menjadi huruf kecil
        System.out.println("b.\tMengubah huruf besar menjadi huruf kecil");
        questionVariable(A, B);
        System.out.println(getToLowerCase(A));
        System.out.println(getToLowerCase(B));
        System.out.println("=============================================");

        //c.	Mengambil sebagian isi dari String
        System.out.println("c.\tMengambil sebagian isi dari String");
        questionVariable(A, B);
        System.out.println(A.substring(0, 6) + " (0, 6) ");
        System.out.println(B.substring(5, 21) + " (5, 21) ");
        System.out.println("=============================================");

        //d.	Membandingkan 2 buah String (return integer)
        System.out.println("d.\tMembandingkan 2 buah String (return integer)");
        questionVariable(A, B);
        int res = A.compareTo(B);
        System.out.println("Hasil perbandingan => " + res);
        System.out.println("=============================================");

        //e.	Mencari nilai index dari sebuah karakter
        System.out.println("e.\tMencari nilai index dari sebuah karakter");
        questionVariable(A, B);
        int searchFrom_A = A.indexOf("P");
        System.out.println("Huruf 'P' di variabel A berada pada index => " + searchFrom_A);
        System.out.println("=============================================");

        //f.	Membandingkan 2 Buah String (return boolean)
        System.out.println("f.\tMembandingkan 2 Buah String (return boolean)");
        questionVariable(A, B);
        String C = "saya";
        String D = "saya";
        System.out.println("Variabel C = " + C);
        System.out.println("Variabel D = " + D);
        System.out.println("Perbandingan antara variabel A dengan B => " + A.contains(B));
        System.out.println("Perbandingan antara variabel C dengan D => " + C.contains(D));
        System.out.println("=============================================");

        //g.	Menggabungkan 2 buah String
        System.out.println("g.\tMenggabungkan 2 buah String");
        String gabungString = A.concat(" dan " + B);
        System.out.println("hasil penggabungan dari String A ke B => " + gabungString);
        System.out.println("=============================================");

        //h.	Melakukan pengecekan apakah value String diakhiri dengan karakter tertentu
        System.out.println("h.\tMelakukan pengecekan apakah value String diakhiri dengan karakter tertentu");
        String kataDiCek = "Java";
        System.out.println("String kataDiCek =  " + kataDiCek);
        System.out.println("Apakah '" + kataDiCek + "' di akhiri dengan huruf 'J' => " + kataDiCek.endsWith("J"));
        System.out.println("=============================================");

        //i.	Melakukan pengecekan apakah value String diawali dengan karakter tertentu
        System.out.println("h.\tMelakukan pengecekan apakah value String diakhiri dengan karakter tertentu");
        System.out.println("String kataDiCek =  " + kataDiCek);
        System.out.println("Apakah '" + kataDiCek + "' di awali dengan huruf 'J' => " + kataDiCek.startsWith("J"));
        System.out.println("=============================================");

        //j.	Mengetahui panjang karakter dari value String
        System.out.println("j.\tMengetahui panjang karakter dari value String");
        System.out.println("String A =  " + A);
        System.out.println("Panjang dari String A => " + A.length());
        System.out.println("=============================================");
    }

    private static void questionVariable(String a, String b) {
        System.out.println("Variabel String A = " + a);
        System.out.println("Variabel String B = " + b);
    }

    private static String getToUpperCase(String a) {
        return a.toUpperCase();
    }

    private static String getToLowerCase(String a) {
        return a.toLowerCase();
    }
}
