package BinarySearchTrees;

public class DeleteBST {
    static class Node{
        int data;
        Node left;
        Node ryt;
        
        Node(int data){
            this.data=data;
            this.left = null;
            this.ryt= null;
        }
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.ryt = delete(root.ryt, val);
        }else if (root.data > val) {
            root.left = delete(root.left, val);
        }else{
            // case 1 
            if(root.left == null && root.ryt == null){
                return null;
            }
            // case 2
            if(root.left == null){
                return root.ryt;
            }
            else if(root.ryt == null){
                return root.left;
            }
            // case 3
            Node is = findis(root.ryt);
            root.data = is.data;
            root.ryt = delete(root.ryt, is.data);
        }
        return root;
    }

    public static Node findis(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.ryt); 
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

        inorder(root);  
        System.out.println();
        delete(root, 5);
        inorder(root);
    }
}
