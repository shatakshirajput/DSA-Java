import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class asgnmt21 {
    static class Node{
        int data;
        Node left; 
        Node ryt; 

        Node(int data){
            this.data = data;
            this.left = null;
            this.ryt = null;
        }
    }

    public static boolean check(Node root, int target){
        if(root == null){
            return true;
        }
        if(root.data != target){
            return false;
        } 
        return check(root.left, target) && check(root.ryt, target);
    }

    public static boolean isUnivalued(Node root){
        if(root==null){
            return true;
        }
        int target = root.data;
        return check(root,target);
    }

    public static Node invert(Node root){
        if(root == null){
            return null;
        }
        Node temp = root.left;
        root.left = root.ryt;
        root.ryt=temp;

        invert(root.left);
        invert(root.ryt);

        return root;
    }

    public static Node deleteNodes(Node root, int x){
        if(root == null){
            return null;
        }
        root.left =  deleteNodes(root.left,x);
        root.ryt =  deleteNodes(root.ryt,x);
        if (root.left == null && root.ryt == null && root.data == x){
            return null;
        }
        return root;
    }

    static Map<String, Integer> map = new HashMap<>();
    static List<Node> result = new ArrayList<>();

    public static List<Node> findDulpicateSubTree(Node root){
        serialise(root);
        return result;
    }

    public static String serialise(Node root){
        if (root == null) {
            return "#";
        }
        String serial = root.data + "," + serialise(root.left) + "," + serialise(root.ryt);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) { 
            result.add(root);
        }
        return serial;
    }

    static int maxSum;

    public static int maxPathSum(Node root){
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }
    private static int maxGain(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(maxGain(root.left), 0);
        int right = Math.max(maxGain(root.ryt), 0);
        maxSum = Math.max(maxSum, root.data + left + right);
        return root.data + Math.max(left, right);
    }

    public static void inorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(root.data+ " ");
        inorder(root.left);
        inorder(root.ryt);
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        System.out.println();

        // Question 1 - Check if a Binary Tree is univalued or not
        // We have a binary tree,the task is to check if the binary tree is univalued or not.If found to be true, then print “YES”. Otherwise, print “NO”.
        Node root1 = new Node(4);
        root1.left = new Node(4);
        root1.ryt = new Node(4);
        System.out.println(isUnivalued(root1) ? "YES" : "NO");

        // Question 2 - Invert Binary Tree 
        // Mirror of a Tree : Mirror of a Binary Tree T is another Binary Tree M(T)with left and right children of all non-leaf nodes interchanged.
        inorder(root);
        System.out.println();
        invert(root);
        inorder(root);

        invert(root);
        System.out.println();

        // Question 3 - Delete leaf nodes with values as x
        // We have a binary tree and a target integer x, delete all the leaf nodes having value as x.Also, delete the newly formed leaves with the target value as x.
        deleteNodes(root,5);
        inorder(root);

        // Question 4 - Find All Duplicate Subtrees
        // We have a binary tree, find all duplicate subtrees. For each duplicate subtree,we only need to return the root node of anyone of them.Two trees are duplicates if they have the same structure with the same node values.
        Node root2 = new Node(1);
        root2.left = new Node(4);
        root2.ryt = new Node(3);
        root2.left.left = new Node(3);
        root2.ryt.left = new Node(4);
        root2.ryt.ryt = new Node(3);
        root2.ryt.left.left = new Node(3);
        List<Node> d = findDulpicateSubTree(root2);
        for(Node n : d){
            System.out.println(n.data);
        }

        // Question 5 - Maximum Path Sum in a Binary Tree
        // We have a binary tree, find the maximum path sum. The path may start and end at any node in the tree.
        Node root3 = new Node(-10);
        root3.left = new Node(9);
        root3.ryt = new Node(20);
        root3.ryt.left = new Node(15);
        root3.ryt.ryt = new Node(7);

        System.out.println(maxPathSum(root3));

    }
}
