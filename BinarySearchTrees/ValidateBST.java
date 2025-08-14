package BinarySearchTrees;

public class ValidateBST {
    static class Node{
        int data;
        Node left ; 
        Node ryt;

        Node (int data){
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root, Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max!= null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.ryt, root, max);
    }

    public static void main(String[] args) {
        Node root= new Node(5);
        root.left = new Node(3);
        root.ryt = new Node(6);
        root.left.ryt = new Node(4);
        root.left.left = new Node(1);
        root.ryt.ryt = new Node(7);

        if(isValidBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
