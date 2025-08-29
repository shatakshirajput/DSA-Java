package Hashing;

import java. util.*;

public class HashMapCode {
    static class HashMap<K,V>{  // generic 
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;  // n
        private int N;
        private LinkedList<Node> buckets[];  // N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i =0;i<4;i++){
                this.buckets[i]= new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key ==  key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N+2];
            N = 2*N;
            for(int i =0 ; i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldBuck) {
                for(int j =0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key , V value){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);   
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1; 
        }

        public V remove(K key){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);   
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);   
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n ==0;
        }
    }

    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",15);
        hm.put("Nepal",10);
        hm.put("Bhutan",50);

        ArrayList<String> keys = hm.keySet();
        for(String k : keys){
            System.out.println(k);
        }

        System.out.println(hm.get("China"));
        System.out.println(hm.remove("China"));
        System.out.println(hm.get("China"));

        System.out.println(hm.isEmpty());
    }
}
