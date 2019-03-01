package binaryTree;

public class Main {
    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.printTree();

        System.out.println("--------------------------------------------------");
        bt.addNewItem(new Node("H"));
        bt.printTree();

        System.out.println("--------------------------------------------------");
        bt.addNewItem(new Node("L"));
        bt.printTree();

        System.out.println("--------------------------------------------------");
        bt.addNewItem(new Node("D"));
        bt.printTree();

        System.out.println("--------------------------------------------------");
        bt.addNewItem(new Node("E"));
        bt.printTree();

        System.out.println("--------------------------------------------------");
        System.out.println("------------------ FULL TREE --------------------");
        bt.addNewItem(new Node("Z"));
        bt.addNewItem(new Node("A"));
        bt.addNewItem(new Node("J"));

        bt.printTree();

        System.out.println("--------------------------------------------------");
        System.out.println("--------------- ANTECESSORS ------------------");
        Node theYungest = new Node("B");
        bt.addNewItem(theYungest);
        bt.printAll(theYungest);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------- SEARCH for 'J'  ------------------");

        bt.search("J");

        System.out.println("--------------------------------------------------");
        System.out.println("--------------- SEARCH for 'Y'  ------------------");

        bt.search("Y");

        System.out.println("--------------------------------------------------");

    }
}
