package KuliahPackage.Thread;

import java.io.File;

public class FileManagement {
    public static void main(String[] args) {
        File oldName = new File("C:\\laragon\\www\\index.php");
        File newName = new File("C:\\laragon\\www\\homepage.php");
        if (oldName.renameTo(newName)) {
            System.out.println("renamed");
        } else {
            System.out.println("Error");
        }
    }

    protected static void comparePath(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        if (file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }
    }
}
