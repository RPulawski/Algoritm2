package binaryTree;

public class Node {
    String value;
    Node parent;
    Node left;
    Node right;

    Node (String val){
        value = val;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    boolean hasParent(){
        return parent != null;
    }
    boolean hasLeftChild(){
        return left != null;
    }
    boolean hasRightChild(){
        return right != null;
    }
}
