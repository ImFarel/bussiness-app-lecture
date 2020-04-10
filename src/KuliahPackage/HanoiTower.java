package KuliahPackage;

public class HanoiTower {
    private int steps = 0;

    public static void main(String[] args) {
        int nDisks = 8;
        doTowers(nDisks, 'A', 'B', 'C');
    }
        
    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
//            this.steps += 1;
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
