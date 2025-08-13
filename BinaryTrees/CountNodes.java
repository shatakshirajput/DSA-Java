package BinaryTrees;

public class CountNodes {
    static class Node{
        int data;
        Node left,ryt;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.ryt=null;
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc= count(root.left);
        int rc= count(root.ryt);
        int c = lc+rc+1;
        return c;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        System.out.println(" "+count(root));
    }
}

