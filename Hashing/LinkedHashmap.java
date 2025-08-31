package Hashing;
import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm  = new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("China",20);
        lhm.put("US",10);
        lhm.put("Bhutan",100);
        lhm.put("Nepal",15);
        System.out.println(lhm);
    }
}
