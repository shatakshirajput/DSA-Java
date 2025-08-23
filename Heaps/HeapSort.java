package Heaps;

public class HeapSort {
    public static void heapify(int arr[],int i , int n ){
        int left = 2*i+1;
        int ryt = 2*i+2;
        int maxIdx =  i ;

        if(left < n && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(ryt < n && arr[ryt] > arr[maxIdx]){
            maxIdx = ryt;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];  
            arr[maxIdx]= temp;

            heapify(arr, maxIdx, n);
        }
    }

    public static void hs(int arr[]) {
        int n = arr.length;
        for(int i = n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i = n -1;i>0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        hs(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");   
        }
    }
}
