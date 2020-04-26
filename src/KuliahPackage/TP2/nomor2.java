package KuliahPackage.TP2;

public class nomor2 {
    int[] stacks = new int[3];

    public void push(int val) {
        if (stacks[0] == 0)
            stacks[0] = val;
        else if (stacks[1] == 0)
            stacks[1] = val;
        else if (stacks[2] == 0)
            stacks[2] = val;
        else
            isFull();
    }

    public void pop() {
        if (stacks[2] != 0)
            stacks[2] = 0;
        else if (stacks[1] != 0)
            stacks[1] = 0;
        else if (stacks[0] != 0)
            stacks[0] = 0;
        else
            isEmpty();
    }

    private void isEmpty() {
        System.out.println("! === ! STACKS KOSONG ! === !");
    }

    private void isFull() {
        System.out.println("! === ! STACKS PENUH ! === !");
    }

    public void clear() {
        stacks[0] = 0;
        stacks[1] = 0;
        stacks[2] = 0;
    }

    void print(){
        for (int stack : stacks) {
            if (stack != 0) {
                System.out.println(stack + " ");
            }
        }
    }

    public static void main(String[] args) {
        nomor2 stack = new nomor2();

        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(4);

        System.out.println("======= PUSH =======");
        stack.print();

        stack.pop();
        System.out.println("======= POP =======");
        stack.print();
    }
}
