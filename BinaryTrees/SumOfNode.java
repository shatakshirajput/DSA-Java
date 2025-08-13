package BinaryTrees;

public class SumOfNode {
    static class Node{
        int data;
        Node left,ryt;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.ryt=null;
        }
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.ryt);
        int s =ls+rs+root.data;
        return s;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        System.out.println(" "+sum(root));
    }
}
