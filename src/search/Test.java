package search;


public class Test {
    public static void main(String[] args) {
       BST bst = new BST();
        bst.add(27);
        bst.add(14);
        bst.add(19);
        bst.add(10);
        bst.add(35);
        bst.add(31);
        bst.add(42);
        bst.preOrder();
        System.out.println("Tìm kiếm số 10 trong cây nhị phân nếu có là true, không có là fasle: " +  bst.search(10));

    }
}
