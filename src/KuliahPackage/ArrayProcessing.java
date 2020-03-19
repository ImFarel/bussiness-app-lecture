package KuliahPackage;

import java.util.*;

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
                "\n5. menampilkan string dari array ke console" +
                "\n6. mencari elemen minimum dan maximum" +
                "\n7. menggabungkan dua array" +
                "\n8. mengisi sekaligus inisialisasi array" +
                "\n9. extend array setelah inisialisasi" +
                "\n10. mengurutkan dan mencari elemen array" +
                "\n11. menampilkan string dari array ke console");
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
            case 6:
                Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
                int min = (int) Collections.min(Arrays.asList(numbers));
                int max = (int) Collections.max(Arrays.asList(numbers));
                System.out.println("Min number: " + min);
                System.out.println("Max number: " + max);
                break;
            case 7:
                String a[] = {"A", "E", "I"};
                String b[] = {"O", "U"};
                List list = new ArrayList(Arrays.asList(a));
                list.addAll(Arrays.asList(b));
                Object[] c = list.toArray();
                System.out.println(Arrays.toString(c));
                break;
            case 8:
                array = new int[6];
                Arrays.fill(array, 100);
                for (int i = 0, n = array.length; i < n; i++) {
                    System.out.println(array[i]);
                }
                System.out.println();
                Arrays.fill(array, 3, 6, 50);
                for (int value : array) {
                    System.out.println(value);
                }
                break;
            case 9:
                String[] names = new String[]{"A", "B", "C"};
                String[] extended = new String[5];
                extended[3] = "D";
                extended[4] = "E";
                System.arraycopy(names, 0, extended, 0, names.length);
                for (String str : extended) {
                    System.out.println(str);
                }
                break;
            case 10:
                Arrays.sort(array);
                printArray("Sorted array", array);
                index = Arrays.binarySearch(array, 2);
                System.out.println("Found 2 @ " + index);
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
