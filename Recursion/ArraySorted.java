package Recursion;

public class ArraySorted {
    public static boolean isSorted(int arr[],int i) {
        if (i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,3,2,7,8};
        System.out.println(isSorted(arr, 0));
        int arr2[]={1,2,3,4};
        System.out.println(isSorted(arr2, 0));
    }
}
