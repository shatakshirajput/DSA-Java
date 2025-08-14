package BinarySearchTrees;

import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node{
        int data;
        Node left;
        Node ryt;

        Node(int data){
            this.data= data;
        }
    }

    public static void getinorder(Node root,ArrayList<Integer> inorder){
        if(root== null){
            return;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.ryt,inorder);
    }

    public static Node createBst(ArrayList<Integer> arr, int start, int end){
        if(start> end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr, start, mid-1);
        root.ryt = createBst(arr, mid+1, end);
        return root;
    }

    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);  

        root = createBst(inorder, 0, inorder.size()-1);
        return root;
    }

    public static void preorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.ryt);
    }
    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.ryt = new Node(10);
        root.ryt.ryt = new Node(11);
        root.ryt.ryt.ryt = new Node(12);

        preorder(root);

        root = balancedBST(root);
        System.out.println();
        preorder(root);
    }
}

