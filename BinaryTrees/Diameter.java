package BinaryTrees;

public class Diameter {
    static class Node{
        int data;
        Node left, ryt;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.ryt=null;
        }
    }

    public static int height (Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh= height(root.ryt);
        return Math.max(lh,rh)+1;
    }

    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }
        int ld= diameter1(root.left);
        int rd= diameter1(root.ryt);
        int lh = height(root.left);
        int rh = height(root.ryt);
        int selfd = lh+rh+1;
        return Math.max(Math.max(ld,rd),selfd);
    } 

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht; 
        }
    }
    public static Info diameter2(Node root){
        if(root== null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rytInfo = diameter2(root.ryt);
        int diam = Math.max(Math.max(leftInfo.diam,rytInfo.diam),leftInfo.ht+rytInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rytInfo.ht)+1;
        return new Info(diam,ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        System.out.println(" "+diameter1(root));
        System.out.println(" "+diameter2(root).diam);
    }
}
