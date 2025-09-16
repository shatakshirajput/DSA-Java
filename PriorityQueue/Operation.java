package PriorityQueue;

import java.util.*;

public class Operation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); //O(logn n)
        pq1.add(3); 
        pq.add(4);
        pq1.add(4);
        pq.add(1);
        pq1.add(1);
        pq.add(7);
        pq1.add(7);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+"  ");  //O(1)
            pq.remove();  //O(logn)
        }

        System.out.println();   

        while(!pq1.isEmpty()){
            System.out.print(pq1.peek()+"  ");  //O(1)
            pq1.remove();  //O(logn)
        }
    }
}