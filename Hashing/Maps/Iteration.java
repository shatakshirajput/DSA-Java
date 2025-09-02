package Hashing;

import java.util.*;

public class Iteration {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",10);
        hm.put("Indonesia",5);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key="+k+" ,value="+hm.get(k));
        }

    }
}
