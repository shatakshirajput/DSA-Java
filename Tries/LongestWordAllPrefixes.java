package Tries;

class LongestWordAllPrefixes {
    static class Node{
        Node children[] =  new Node[26];
        boolean eow = false;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;   
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
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
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow == true;
    }

    static String ans = "";
    public static void longestWord(StringBuilder temp,Node root){
        if(root == null){
            return;
        }
        for(int i = 0;i < 26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i + 'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(temp, root.children[i]);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args){
        String words[] = {"a","banana","app","apply","ap","apple","appl"};
        for(int i = 0;i < words.length;i++){
            insert(words[i]);
        }
        longestWord(new StringBuilder(""), root);
        System.out.println(ans);
    }
}