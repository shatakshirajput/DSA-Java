package BinarySearchTrees.AVLTrees;

public class AVLTree {
    static class Node{
        int data , height;
        Node left,ryt;

        Node(int data){
            this.data = data;
            height =1;
        }
    }
    static Node root;

    static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    // Right rotate subtree rooted with y
    static Node rightRotate(Node y) { 
        Node x=y.left;
        Node T2=x.ryt; 

        // rotation using 3 nodes
        x.ryt=y;
        y.left=T2;

        // update heights
        y.height=Math.max(height(y.left),height(y.ryt))+1;
        x.height=Math.max(height(x.left),height(x.ryt))+1;

        // x is new root
        return x;
    }
    
    // Left rotate subtree rooted with x 
    static Node leftRotate(Node x) {
        Node y=x.ryt; 
        Node T2=y.left;

        // rotation using 3 nodes
        y.left=x;
        x.ryt=T2;

        // update heights
        x.height=Math.max(height(x.left),height(x.ryt))+1;
        y.height=Math.max(height(y.left),height(y.ryt))+1;

        // y is new root
        return y;
    }
    
    // Get Balance factor of node
    static int getBalance(Node root) {
        if(root==null){
            return 0;
        }
        return height(root.left) - height(root.ryt);
    }

    static Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }else if(key> root.data){
            root.ryt = insert(root.ryt, key);
        }
        else{
            return root;
        }

        root.height = 1+ Math.max(height(root.left),height(root.ryt));
        int bf = getBalance(root);

        //ll case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }
        //rr Case
        if(bf< -1 && key > root.ryt.data){
            return leftRotate(root);
        }
        //lr Case 
        if(bf > 1 && key> root.left.data) {
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        //rl Case
        if(bf < -1 && key<root.ryt.data) {
            root.ryt=rightRotate(root.ryt);
            return leftRotate(root);
        }
        return root;
    }

    static void preorder(Node root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.ryt); 
    }

    public static void main(String[] args){
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        preorder(root);
    }
}