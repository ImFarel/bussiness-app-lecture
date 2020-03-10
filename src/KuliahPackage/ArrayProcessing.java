package KuliahPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. mengurutkan dan mencari data pada array
 * 2. mengurutkan dan menyisipkan elemen pada array
 * 3. batas atas array dua dimensi
 * 4. membalik array
 * 5. menampilkan string dari array ke console
 */
public class ArrayProcessing {
    public static void main(String[] args) {
        System.out.println("Pilih opsi" +
                "\n1. mengurutkan dan mencari data pada array" +
                "\n2. mengurutkan dan menyisipkan elemen pada array" +
                "\n3. batas atas array dua dimensi" +
                "\n4. membalik array" +
                "\n5. menampilkan string dari array ke console");
        System.out.print("Menu => ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        switch (menu) {
            case 1:
                System.out.println("1. mengurutkan dan mencari data pada array");
                Arrays.sort(array);
                printArray("Sorted array", array);
                System.out.println("binnarySearch => 2");
                int index = Arrays.binarySearch(array, 2);
                System.out.println("Found 2 @ " + index);
                break;
            case 2:
                System.out.println("2. mengurutkan dan menyisipkan elemen pada array");
                Arrays.sort(array);
                printArray("Sorted array", array);
                int index2 = Arrays.binarySearch(array, 1);
                System.out.println("Didn't find 1 @ " + index2);
                int newIndex = -index2 - 1;
                array = insertElement(array, 1, newIndex);
                printArray("With 1 added", array);
                break;
            case 3:
                System.out.println("3. batas atas array dua dimensi");
                String[][] data = new String[2][5];
                System.out.println("Dimension 1: " + data.length);
                System.out.println("Dimension 2: " + data[0].length);
                break;
            case 4:
                System.out.println("4. membalik array");
                ArrayList arrayList = new ArrayList();
                arrayList.add("A");
                arrayList.add("B");
                arrayList.add("C");
                arrayList.add("D");
                arrayList.add("E");
                System.out.println("Before Reverse Order: " + arrayList);
                Collections.reverse(arrayList);
                System.out.println("After Reverse Order: " + arrayList);
                break;
            case 5:
                System.out.println("5. menampilkan string dari array ke console");
                String[] greeting = new String[3];
                greeting[0] = "This is the greeting";
                greeting[1] = "for all the readers from";
                greeting[2] = "Java Source .";
                for (int i = 0; i < greeting.length; i++) {
                    System.out.println(greeting[i]);
                }
                break;
        }
    }

    private static int[] insertElement(int[] array, int i, int newIndex) {
        int length = array.length;
        int destination[] = new int[length + 1];
        System.arraycopy(array, 0, destination, 0, newIndex);
        destination[newIndex] = i;
        System.arraycopy(array, newIndex, destination, newIndex + 1, length - newIndex);
        return destination;
    }

    private static void printArray(String text, int[] array) {
        System.out.println(text + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
