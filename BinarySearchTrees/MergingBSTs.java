package BinarySearchTrees;

import java.util.*;

public class MergingBSTs {
    static class Node{
        int data;
        Node left;
        Node ryt;

        public Node(int data){
            this.data= data;
            this.left = this.ryt =  null;
        }
    }

    static void getinorder(Node root,ArrayList<Integer> arr){
        if(root== null){
            return;
        }
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.ryt,arr);
    }

    static Node mergebst(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root1,arr1);
        getinorder(root2,arr2);

        //merging arr
        int i =arr1.get(0);
        int j = arr2.get(0);
        ArrayList<Integer> merge = new ArrayList<>();
        while(i < arr1.size() && j< arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                merge.add(arr1.get(i));
                i++;
            }else{
                merge.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            merge.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            merge.add(arr2.get(j));
            j++;
        }

        //bst from merged array
        Node root = createbst(merge,0,merge.size()-1);
        return root;
    }

    static Node createbst(ArrayList<Integer> arr,int start,int end){
        if(start > end){
            return null;
        }
        int mid =(start+ end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createbst(arr, start, mid-1);
        root.ryt = createbst(arr, mid-1, end);
        return root;
    }

    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print("    "+root.data);
        preorder(root.left);
        preorder(root.ryt);
    }
    public static void main(String args[]){
        Node root1= new Node(2);
        root1.left = new Node(1);
        root1.ryt = new Node(4);

        Node root2= new Node(9);
        root2.left= new Node(3);
        root2.ryt= new Node(12);

        Node root = mergebst(root1, root2);
        preorder(root);
    }
}
