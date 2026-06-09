package Tries;

public class UniqueSubstring {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0;i < 26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i =0;i < word.length();i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0;i < key.length();i++){
            int index = key.charAt(i) -'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow == true;
    }

    public static int countNodes(Node root){
        int count = 0;
        if(root == null){
            return 0;
        }
        for(int i = 0;i < 6; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String word = "ababa";
        for(int i = 0;i < word.length(); i++){
            String suffix = word.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }   
}