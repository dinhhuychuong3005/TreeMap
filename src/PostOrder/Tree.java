package PostOrder;

import BinarySearchTree.TreeNode;

public class Tree {
    Node root = null;

    public Tree() {
    }

    public void add(int value1) {
        if (root == null) {
            root = new Node(value1);
        } else {
            Node thisNode = root;
            while (true) {
                Node parent = thisNode;
                if (value1 < thisNode.value) {
                    thisNode = thisNode.left;
                    if (thisNode == null) {
                        parent.left = new Node(value1);
                        return;
                    }
                } else if (value1 > thisNode.value) {
                    thisNode = thisNode.right;
                    if (thisNode == null) {
                        parent.right = new Node(value1);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void traverse() {
        traverseRecursive(root);
    }

    private void traverseRecursive(Node node) {
        if (node != null) {
            traverseRecursive(node.left);
            traverseRecursive(node.right);
            System.out.println(node.value + " ");
        }
    }
}
