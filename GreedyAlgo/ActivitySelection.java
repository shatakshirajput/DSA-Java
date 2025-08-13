package GreedyAlgo;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] ={1,3,0,5,8,5};
        int end[] ={2,4,6,7,9,9};

        /* 
        //if not sorted as per end time , we will sort it by using 2d array and then sorting it by comaparator

        int activities[][]=new int[start.length][3];

        // for creating 2d array and storing index value at 0, start value at 1, end value at 2

        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lamba function 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        */

        // already sorted as per end time
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct=1;
        ans.add(0);

        int lastEnd = end[0];
        for(int i =1; i<end.length;i++){
            if(start[i] >= lastEnd){
                // activity select 
                maxAct++;
                ans.add(i);

                // update lastend 
                lastEnd=end[i];
            }
        }

        System.out.println("Max Activities : "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i)+" ");
        }
        System.out.println();
    }
}
