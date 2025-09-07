package Hashing.Sets;

import java.util.HashSet;

public class Operations {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.remove(1);
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("true");
        }

        set.clear();          
        System.out.println(set.isEmpty());
    }                                         
}    