package xoaphantu;

public class Test {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);
        System.out.println("Chưa xóa");
        bst.inOrder();
        bst.remove(30);
        System.out.println("\nsau khi xóa 30");
        bst.inOrder();
        bst.remove(40);
        System.out.println("\nSau khi xóa 40");
        bst.inOrder();
    }
}
