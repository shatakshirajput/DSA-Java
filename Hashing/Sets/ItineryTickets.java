package Hashing.Sets;

import java.util.HashMap;

public class ItineryTickets {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String ,String> rev = new HashMap<>();
        for(String key : rev.keySet()){
            rev.put(tickets.get(key),key);
        }
        for(String k: tickets.keySet()){
            if(!rev.containsKey(k)){
                return k;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String,String> tickets= new HashMap<>();
        tickets.put("C","B");
        tickets.put("M","D");
        tickets.put("G","C");
        tickets.put("D","G");

        String s = getStart(tickets);
        System.out.println(s);
        for(String k : tickets.keySet()){
            System.out.print(" -> "+tickets.get(s));
            s = tickets.get(s);
        }
        System.out.println();
    }
}
