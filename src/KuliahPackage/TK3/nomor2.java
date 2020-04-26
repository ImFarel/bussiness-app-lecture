package KuliahPackage.TK3;

public class nomor2 {
    public static void main(String[] args) {
        Integer[] angka = {60, 55, 45, 57, 100, 67, 107, 59, 101};
        BinaryTree<Integer> pohon = new BinaryTree<>(angka);

        System.out.print("Inorder : ");
        pohon.inorder();
        System.out.print("\nPostorder : ");
        pohon.postorder();
        System.out.print("\nPreorder : ");
        pohon.preorder();
    }
}