package BinaryTrees;

import java.util.*;

public class Traversal {
    static class Node{
        int data;
        Node left;
        Node ryt;

        Node(int data){
            this.data=data;
            this.left= null;
            this.ryt=null;
        }
    }

    //making a tree
    static class BT{
        static int idx=-1;
        public static Node build(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.ryt=build(nodes);
            return newNode;
        }

        //preorder traversal
        public static void preorder(Node root){
            if(root == null){
                return ;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.ryt);
        }

        //inorder traversal
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.ryt); 
        }

        //postorder traversal
        public static void postorder(Node root){
            if(root == null){
                return ;
            }
            postorder(root.left); 
            postorder(root.ryt);
            System.out.print(root.data+ " ");
        }

        //levelorder
        public static void levelorder(Node root) {
            if (root==null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data);
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.ryt != null){
                        q.add(currNode.ryt);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.build(nodes);

        System.out.println("Preorder - >");
        tree.preorder(root);
        System.out.println("Inorder - >");
        tree.inorder(root);
        System.out.println("Postorder - >");
        tree.postorder(root);
        System.out.println("Levelorder - >");
        tree.levelorder(root);
    }
}