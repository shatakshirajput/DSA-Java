package Hashing.Sets;

import java.util.*;

public class ConutDistinctElements {

    public static void main(String[] args) {
        int num[] ={4,3,2,2,3,4,5,6,1,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<num.length;i++){
            set.add(num[i]);
        }

        System.out.println(" "+set.size());
    }
}