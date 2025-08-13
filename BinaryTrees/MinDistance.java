package BinaryTrees;

import java.util.ArrayList;

public class MinDistance {
    static class Node{
        int data;
        Node left;
        Node ryt;

        Node(int data){
            this.data=data;
            this.left=null;
            this.ryt=null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path ){
        if(root==null){
            return false;
        }

        path.add(root);
        if(root.data==n){
            return true;
        }

        boolean leftfound = getPath(root.left,n,path);
        boolean rytfound = getPath(root.ryt,n,path);

        if(leftfound || rytfound){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root,int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca=lca(root.left, n1, n2);
        Node rytlca=lca(root.ryt, n1, n2);

        if(rytlca==null){
            return leftlca;
        }
        if (leftlca == null) {
            return rytlca;
        }
        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist = lcaDist(root.left,n);
        int rytDist = lcaDist(root.ryt,n);
        if(leftDist == -1 && rytDist == -1){
            return -1;
        }else if(leftDist ==-1 ){
            return rytDist +1;
        }
        else{
            return leftDist+1;
        }
    }

    public static int minDist(Node root, int n1, int n2){
        Node l = lca(root, n1, n2);

        int dist1 = lcaDist(l,n1);
        int dist2 = lcaDist(l,n1);

        return dist1 +dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        int n1 = 4;
        int n2 = 6;

        System.out.println("    "+lca(root,n1,n2).data);
        System.out.println(minDist(root,n1,n2));
    }
}
