package BinaryTrees;
import java.util.*;

public class LCA {
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
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i =0;
        for(; i< path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lcanode = path1.get(i-1);
        return lcanode;
    }

    public static Node lca2(Node root,int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca=lca2(root.left, n1, n2);
        Node rytlca=lca2(root.ryt, n1, n2);

        if(rytlca==null){
            return leftlca;
        }
        if (leftlca == null) {
            return rytlca;
        }
        return root;
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
        System.out.println("    "+lca2(root,n1,n2).data);
    
    }
}
