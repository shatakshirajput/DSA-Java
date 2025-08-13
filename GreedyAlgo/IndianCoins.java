package GreedyAlgo;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20,50,100,500,2000};
        int amt=5599;
        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(coins , Comparator.reverseOrder());
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amt){
                while (coins[i]<=amt) {
                    count++;
                    ans.add(coins[i]);
                    amt-=coins[i];
                }
            }
        }

        System.out.println("Numbers of coins :"+count);

        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}