package Sorting.DivideAndConquer;

public class RotatedSorted {
    public static int search(int arr[],int tar,int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid =si+(ei-si)/2;
        if (arr[mid]==tar) {
            return mid;
        }
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid);
            }
            //case b
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            //case c
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case d
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int srr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(" "+search(srr, tar, 0, srr.length-1));
    }
}
