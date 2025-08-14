package BinarySearchTrees;

public class SizeOfLargestBST {
    static class Node{
        int data ;
        Node left ;
        Node ryt;

        public Node(int data){
            this.data= data;
            this.left = this.ryt = null;
        }
    }

    static class Info{
        boolean isbst;
        int size;
        int min; 
        int max;

        public Info(boolean isbst , int size, int min,int max){
            this.isbst=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    
    public static int maxbst = 0;

    static Info largestBST(Node root){
        if(root== null){
            return new Info(true,0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo =largestBST(root.left);
        Info rytInfo=  largestBST(root.ryt);

        int size = leftInfo.size + rytInfo.size +1;
        int min = Math.min(root.data , Math.min(leftInfo.min,rytInfo.min));
        int max = Math.max(root.data , Math.max(leftInfo.max,rytInfo.max));
        
        if(root.data <= leftInfo.max || root.data >= rytInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isbst && rytInfo.isbst){
            maxbst = Math.max(maxbst,size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size,min,max);
    }

    public static void main(String[] args) {
        Node root = new Node(50); 
        root.left = new Node(30);       
        root.left.left = new Node(5);       
        root.left.ryt = new Node(20);
        root.ryt= new Node(60);       
        root.ryt.left= new Node(45);       
        root.ryt.ryt= new Node(70);       
        root.ryt.ryt.left= new Node(65);        
        root.ryt.ryt.ryt= new Node(80);  
        
        largestBST(root);
        System.out.println("   "+maxbst);
    }
}
