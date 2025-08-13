package BinarySearchTrees;

public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node ryt;

        Node(int data){
            this.data = data;
            this.left = null;
            this.ryt = null;
        }
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data <=k2){
            printInRange(root.left, k1, k2);
            System.out.print("  "+root.data);
            printInRange(root.ryt, k1, k2);
        }else if(root.data <k1){
            printInRange(root.left, k1, k2); 
        }else{
            printInRange(root.ryt, k1, k2);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.ryt = new Node(10);
        root.left.left = new Node(3);
        root.left.ryt = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.ryt = new Node(4);
        root.ryt.ryt = new Node(11);
        root.ryt.ryt.ryt = new Node(14);

        printInRange(root, 5, 12);
    }
}
