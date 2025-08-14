package BinarySearchTrees;

public class SortedArrToBST {
    static class Node{
        int data;
        Node left;
        Node ryt;

        Node(int data){
            this.data= data;
        }
    }

    public static Node createBst(int[] arr, int start, int end){
        if(start> end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, start, mid-1);
        root.ryt = createBst(arr, mid+1, end);
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
        int arr[]= {3,5,6,8,10,11,12};

        Node root = createBst(arr, 0, arr.length-1);
        preorder(root);
    }
}
