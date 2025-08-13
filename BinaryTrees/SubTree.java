package BinaryTrees;

public class SubTree {
    static class Node{
        int data;
        Node left, ryt;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.ryt=null;
        }
    }

    public static boolean isSubTree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data== subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubTree(root.left, subroot.left) || isSubTree(root.ryt, subroot.ryt);
    }

    public static boolean isIdentical(Node node, Node subroot){
        if(node == null&& subroot==null){
            return true;
        }else if(node == null || subroot == null || node.data!=subroot.data){
            return false;
        } 
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.ryt, subroot.ryt)){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left=new Node(2);
        root.ryt=new Node(3);
        root.left.left=new Node(4);
        root.left.ryt=new Node(5);
        root.ryt.left=new Node(6);
        root.ryt.ryt=new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.ryt=new Node(5);

        System.out.println(isSubTree(root,subroot));
    }
}
