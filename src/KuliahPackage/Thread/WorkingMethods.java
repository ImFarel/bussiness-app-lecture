package KuliahPackage.Thread;

public class WorkingMethods {

    private static long fiboGen(long num) {
        if ((num == 0) || (num == 1))
            return num;
        else
            return fiboGen(num - 1) + fiboGen(num - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("Fibonacci dari %d adalah: %d\n", i, fiboGen(i));
        }
    }
}
