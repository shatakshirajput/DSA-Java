package Arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
 
        //Ascending order
        System.out.println("Before : " + list);
        Collections.sort(list);
        System.out.println("After : " + list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse Order: "+list);
    }
}
