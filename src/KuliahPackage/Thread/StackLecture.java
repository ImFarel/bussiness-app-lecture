package KuliahPackage.Thread;

import java.io.IOException;
import java.util.Stack;

public class StackLecture {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    private static void stackAddition(Stack<Integer> st) {
        System.out.println("Ukuran stack => " + st.size());
        int addition = 0;
        for (int i = 0; i < st.size(); i++) {
            Object[] stArray = st.toArray();
            addition = ((Integer) stArray[i]) + addition;
        }
        System.out.println("Hasil penjumlahan => " + addition);
    }

    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        showpush(st, 5);
        showpush(st, 2);
        showpush(st, 3);
        showpush(st, 1);
        showpush(st, 4);
        stackAddition(st);
    }
}
