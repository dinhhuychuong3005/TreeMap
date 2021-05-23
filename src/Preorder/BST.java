package Preorder;

public class BST {
    private Node root;

    public BST() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node node = root;
            while (true) {
                Node parent = node;
                if (value < node.getData()) {
                    node = node.getLeft();
                    if (node == null) {
                        parent.setLeft(new Node(value));
                        return;
                    }
                } else if (value > node.getData()) {
                    node = node.getRight();
                    if (node == null) {
                        parent.setRight(new Node(value));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
    private void doPreOrder(Node root) {

        if(root == null){
            return;
        }
        System.out.print(root.getData()+" ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    public void preOrder(){
        doPreOrder(root);
    }
}
