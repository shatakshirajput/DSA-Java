// ASSIGNMENT 7 - ARRAYS 

public class asgnmt7 {
    public static boolean repeat(int[] nums){
        for(int i =0;i<=nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int trappingWater(int[] height){
        int n= height.length;
        int wt =  0;
        //left max
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //ryt max 
        int rytMax[]=new int[n];
        rytMax[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rytMax[i]= Math.max(height[i],rytMax[i+1]);
        }
        //loop
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i],rytMax[i]);
            wt+= waterLevel - height[i];
        }
        return wt ;
    }

    public static void triplets(int[] nums){
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k=j+1;k<nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k]==0) {
                        System.out.println("["+ nums[i] + "," +nums[j] + "," + nums[k] + "]");
                    }
                }
            }
        }
    }
                     
    public static void main(String[] args){
        // Ques 1 - given an integer array nums,return true if any value appears at least twicw in the array, and return false if every element is distinct
        int[] nums1= {1,2,3,1};
        int[] nums2= {1,2,3,4};
        int[] nums3= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(repeat(nums1));
        System.out.println(repeat(nums2));
        System.out.println(repeat(nums3));
        
        // Ques 2 - There is an integer array nums sorted in ascending order(with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k(1 <= k < nums.length)such that the resulting array is [nums[k],nums[k+1],...,nums[n-1],nums[0], nums[1],...,nums[k-1]](0-indexed).For example,[0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target,return the index of target if it is in nums, or -1 if it is not in nums.You must write an algorithm with O(log n) runtime complexity.
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0)); 
        System.out.println(search(arr,3)); 
        int[] arr1 = {1};
        System.out.println(search(arr1,0)); 

        // Ques 3 - You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        int prices[] = {7,1,5,3,6,4};
        int cp=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if (cp<prices[i]) {
                int profit= prices[i]-cp;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                cp=prices[i];
            }
        }
        System.out.println("MaxProfit => "+maxProfit);

        // Ques 4 - Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height1[]= {4,2,0,3,2,5};
        System.out.println(trappingWater(height));
        System.out.println(trappingWater(height1));

        // Ques 5 - Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums11={};
        int[] nums22={0};
        triplets(nums);   
        triplets(nums11);   
        triplets(nums22);   
    }
}
