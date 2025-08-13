package BinaryTrees;

public class KthLevel {
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

    public static void KLevel(Node root, int level,int k){
        if(root==null){
            return;
        }
        if(level == k){
            System.out.print("   "+ root.data);
            return;
        }
        KLevel(root.left,level+1,k);
        KLevel(root.ryt,level+1,k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
    
        int k=3;
        KLevel(root,1,k);
    }
}
