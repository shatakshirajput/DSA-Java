package BinarySearchTrees;

import java.util.ArrayList;

public class RootToLeafPath {
    static class Node{
        int data;
        Node left ; 
        Node ryt;

        Node (int data){
            this.data = data;
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i =0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root== null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.ryt == null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.ryt, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Node root =  new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.ryt = new Node(6);
        root.ryt = new Node(10);
        root.ryt.ryt = new Node(11);
        root.ryt.ryt.ryt = new Node(14);
        printRootToLeaf(root, new ArrayList<>());
    }
}
