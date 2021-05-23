package xoaphantu;

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

    private int minValue(Node node) {
        if (node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
    }

    public Node removeNode(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(removeNode(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(removeNode(root.getRight(), data));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            } else {
                int min = minValue(root.getRight());
                root.setData(min);
                root.setRight(removeNode(root.getRight(), min));
            }
        }
        return root;
    }

    public void remove(int data) {
        removeNode(root, data);
    }

    private void doInOrder(Node root) {
        if (root == null) {
            return;
        }
        doInOrder(root.getLeft());
        System.out.print(root.getData() + "\t");
        doInOrder(root.getRight());
    }

    public void inOrder() {
        doInOrder(root);
    }
}
