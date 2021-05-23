package PostOrder;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(27);
        tree.add(14);
        tree.add(19);
        tree.add(10);
        tree.add(35);
        tree.add(31);
        tree.add(42);
//        tree.add(10);
//        tree.add(20);
//        tree.add(50);
//        tree.add(40);
        tree.traverse();
    }
}
