package Hashing;
import java.util.*;

public class Treemap {
    public static void main(String[] args){
        TreeMap<String, Integer> tm  = new TreeMap<>();
        tm.put("India",150);
        tm.put("China",20);
        tm.put("US",10);
        tm.put("Bhutan",100);
        tm.put("Nepal",15);
        System.out.println(tm);
    }
}
