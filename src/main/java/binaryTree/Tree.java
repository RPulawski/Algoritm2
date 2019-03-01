package binaryTree;

public class Tree {
    Node root;

    public void addNewItem(Node newNode){
        if(root == null){
            root = newNode;
            return ;
        }
        chooseSide(newNode,root);
    }

    private void chooseSide(Node newNode, Node currentNode){
        int result = newNode.getValue().compareTo(currentNode.getValue());
        if(result<0){
            addToLeft(newNode,currentNode);
        }else {
            addToRight(newNode,currentNode);
        }
    }

    private void addToLeft(Node newNode, Node parentNode){
        if(parentNode.hasLeftChild()){
            chooseSide(newNode,parentNode.getLeft());
        }else {
            parentNode.setLeft(newNode);
            newNode.setParent(parentNode);
        }
    }

    private void addToRight(Node newNode, Node parentNode){
        if(parentNode.hasRightChild()){
            chooseSide(newNode,parentNode.getRight());
        }else {
            parentNode.setRight(newNode);
            newNode.setParent(parentNode);
        }
    }

    public void printTree(){
        if(root == null){
            System.out.println("Tree is empty");
        }else{
            printChilds(root);
        }
    }

    public void printChilds(Node node){
        if(node == null){
            return;
        }
        if(!node.hasLeftChild() && !node.hasRightChild()){
            System.out.println(String.format("Node %s is a leaf. ", node.getValue()));
        }else {
            if(node.hasLeftChild()){
                System.out.println(String.format("Node %s has left node %s.",
                        node.getValue(),node.getLeft().getValue()));
                printChilds(node.getLeft());
            }

            if(node.hasRightChild()){
                System.out.println(String.format("Node %s has right node %s.",
                        node.getValue(),node.getRight().getValue()));
                printChilds(node.getRight());
            }
        }
    }

    public void printAll(Node node){
        if(node == null){
            return;
        }
        if(!node.hasParent()){
            System.out.println("Very first ancestors: "+node.getValue());
        }else {
            printAll(node.getParent());
            System.out.println("Ancestors name: "+node.getValue());
        }
    }

    Integer level;

    public void search(String key){
        level = -1;

        Node founded = search(key,root);
        String msg = String.format("%s at level %d",(founded == null) ? "Not found" : "Found",level );
        System.out.println(msg);
        printChilds(founded);
        printAll(founded);
    }

    private Node search(String key, Node node){
        if(node == null){
            return null;
        }
        int result = key.compareTo(node.getValue());
        if(result<0){
            node = search(key,node.getLeft());
        }else if(result>0){
            node = search(key,node.getRight());
        }
        ++level;
        return node;
    }
}
