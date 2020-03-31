package KuliahPackage.Thread;

public class BreakForLoop {
    public static void main(String[] args) {
        int[] target = {99, 12, 22, 34, 45, 67, 5678, 8990};
        int no = 5678;
        int i = 0;
        boolean found = false;
        for (; i < target.length; i++) {
            if (target[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found the no: " + no + " at  index: " + i);
        } else {
            System.out.println(no + "not found  in the array");
        }
    }
}
