package BinaryTrees;

public class TransformToSumTree {
    static class Node{
        Node left;
        Node ryt;
        int data;

        Node(int data){
            this.data = data;
            this.left = null;
            this.ryt = null;
        }
    }

    public static void preOrder(Node root){
        if(root== null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.ryt);
    }

    public static int transform(Node root){
        if(root== null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rytChild = transform(root.ryt);
        int data = root.data;

        int newLeft = root.left == null ? 0: root.left.data;
        int newRyt = root.ryt == null ? 0: root.ryt.data;

        root.data = leftChild + rytChild + newLeft + newRyt;

        return data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        transform(root);
        preOrder(root);
    }
}
