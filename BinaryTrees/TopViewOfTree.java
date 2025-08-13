package BinaryTrees;

import java.util.*;

public class TopViewOfTree {
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

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void TopView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        //level order traversal
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.ryt != null){
                    q.add(new Info(curr.node.ryt,curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i =min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.ryt = new Node(3);
        root.left.left = new Node(4);
        root.left.ryt = new Node(5);
        root.ryt.left = new Node(6);
        root.ryt.ryt = new Node(7);
        
        TopView(root);
    }
}
