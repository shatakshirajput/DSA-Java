// ASSIGNMENT 8 - SORTING

/*  Question :Use the following sorting algorithms tosort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort.
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
*/ 

public class asgnmt8 {
    public static void bubbleSort(int[] arr){
        for (int turns = 0; turns < arr.length-1; turns++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]<=arr[i+1]) {
                    //swap
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println();
    }  
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }  
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding current position
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }  
    public static void countingSort(int[] arr){
        int largest =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }  
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }  
    public static void main(String[] args) {
        int[] arr1={3,6,2,1,8,7,4,5,3,1};
        int[] arr2={3,6,2,1,8,7,4,5,3,1};
        int[] arr3={3,6,2,1,8,7,4,5,3,1};
        int[] arr4={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr1);
        System.out.println("Using bubble sort ->");
        printArr(arr1);
        selectionSort(arr2);
        System.out.println("Using selection sort ->");
        printArr(arr2);
        insertionSort(arr3);
        System.out.println("Using insertion sort ->");
        printArr(arr3);
        countingSort(arr4);
        System.out.println("Using counting sort ->");
        printArr(arr4);
    }
}
