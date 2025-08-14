package BinaryTrees;

public class BuildTree {
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
    }
    public static void main(String[] args) {
        // int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BT tree = new BT();
        // Node root = tree.build(nodes);
        // System.out.println("  " + root.data);
    }
}