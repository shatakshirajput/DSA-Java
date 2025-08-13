package Stacks;

import java.util.*;

public class MaxAreaInHistogram {
    public static void areaInHistogram(int[] arr){
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // nsr 
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek(); // store index
            }
            s.push(i);
        }

        // nsl
        s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek(); // store index
            }
            s.push(i);
        }

        // loop to calculate area
        for(int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = arr[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Maximum Area : " + maxArea);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 6, 2, 3};
        int[] arr2 = {2, 4};
        areaInHistogram(arr1);
        areaInHistogram(arr2);
    }
}
