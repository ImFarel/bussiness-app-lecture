package KuliahPackage.TK2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class nomor3 {
    public static void main(String[] args) {
        String pathname = "F:\\NestJS\\taskmanagement-nestjs";
        System.out.printf("Direktori dari %s\n", pathname);
        final File folder = new File(pathname);

        List<String> result = new ArrayList<>();

        search(folder, result);

        for (String s : result) {
            System.out.printf("\"%s\" adalah sebuah file\n", s);
        }

    }

    public static void search(final File folder, List<String> result) {
        for (final File f : folder.listFiles()) {
            if (f.isDirectory()) {
                System.out.printf("\"\\%s\" adalah direktori\n", f.getName());
            }

            if (f.isFile()) {
                result.add(f.getName());
            }
        }
    }
}
