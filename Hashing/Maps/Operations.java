package Hashing.Maps;

import java.util.HashMap;

public class Operations {
    public static void main(String[] args){
        HashMap<String , Integer> hm = new HashMap<>();
        
        // add
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",10);

        System.out.println(hm);

        // get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("England"));

        //containskey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("England"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("England"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
