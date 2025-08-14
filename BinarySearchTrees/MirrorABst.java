package BinarySearchTrees;

public class MirrorABst {
    static class Node {
        int data;
        Node left;
        Node ryt;
        Node(int data){
            this.data=data;
        }
    }

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftst= mirror(root.left);
        Node rytst= mirror(root.ryt);
        root.left = rytst;
        root.ryt = leftst;
        return root;
    }

    public static void preorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(" " + root.data);
        preorder(root.left);
        preorder(root.ryt);
    }
    public static void main(String[] args) {
        Node root= new Node(8);
        root.left = new Node(5);
        root.ryt = new Node(10);
        root.left.ryt = new Node(6);
        root.left.left = new Node(3);
        root.ryt.ryt = new Node(11);

        preorder(root);
        mirror(root);
        System.err.println();
        preorder(root);
    }
}
