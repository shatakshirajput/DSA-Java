package Recursion;

public class FirstOccurence{
    public static int FirstOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,2,3,1,2,3,2,3,4};
        System.out.println(FirstOcc(arr, 1, 0));
        System.out.println(FirstOcc(arr, 2, 0));
        System.out.println(FirstOcc(arr, 3, 0));
    }
}