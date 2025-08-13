package Searching;

public class BinarySearch {
    public static int binSearch(int num[],int key) {
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid = ((start+end)/2);
            if(key==num[mid]){
                return mid;
            }else if(key<num[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int key =3;
        System.out.println("Element is at index "+binSearch(num, key));
    }
}
