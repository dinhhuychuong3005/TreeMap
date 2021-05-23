package search;

public class BST {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public void add(int value){
        if (root == null) {
            root = new Node(value);
        }else {
            Node node = root;
            while (true){
                Node parent = node;
                if (value<node.getData()){
                    node = node.getLeft();
                    if (node == null){
                        parent.setLeft(new Node(value));
                        return;
                    }
                }else if (value>node.getData()){
                    node = node.getRight();
                    if (node == null){
                        parent.setRight(new Node(value));
                        return;
                    }
                }else {
                    return;
                }
            }
        }
    }
    public boolean search(int value){
        Node current = root;
        while (current!= null) {
            if (value < current.getData()) {
                current = current.getLeft();
            } else if (value > current.getData()) {
                current = current.getRight();
            } else {
                return true;
            }
        }
        return false;
    }
    public void doPreOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.getData() + " ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    public void preOrder(){
        doPreOrder(root);
    }
}
