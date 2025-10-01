package Tries;

public class WordBreakProb {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i<children.length;i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level =0 ;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i =0;i<key.length();i++){
            int idx  = key.charAt(i)-'a';
            if(curr.children[idx]== null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i = 1;i <= key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String[] words ={"i","like","sam","samsung","mobile","ice"};
        String key = "ilikesams";
        for (String word : words) {
            insert(word);
        }
        System.out.println(wordBreak(key));
    }
}
