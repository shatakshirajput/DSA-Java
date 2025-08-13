package Recursion;

public class LastOccurence {
    public static int LastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastOcc(arr,key,i+1);
        if(isFound==-1&& arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,2,3,1,2,3,2,3,4};
        System.out.println(LastOcc(arr, 1, 0));
        System.out.println(LastOcc(arr, 2, 0));
        System.out.println(LastOcc(arr, 3, 0));
    }
}
