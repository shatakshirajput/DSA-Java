package Hashing.Sets;

import java.util.*;

public class Iteration {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        for(Integer k : set){
            System.out.println(k);
        }

        // second way
        // using iterator

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}