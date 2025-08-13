package Arraylists;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {

        // creating arraylists
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        //adding new element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list.add(1,8); -O(n) for adding 8 at index 1.
        
        //printing arraylist 
        System.out.println("        "+list);

        //get element - O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove element - O(n)
        list.remove(3);
        System.out.println(list);

        // set element at index - O(n)
        list.set(3,4);
        System.out.println(list);

        // contains elements - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
