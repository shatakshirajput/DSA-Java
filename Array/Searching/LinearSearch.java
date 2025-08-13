package Searching;

public class LinearSearch {
    public static int linearSearching(int numbers[] ,int key){
        for (int i =1; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5};
        int key = 3;
        int index=linearSearching(numbers, key);
        if(index==-1){
            System.out.println(" Not found");
        }else{
            System.out.println(" Element found at index"+index);
        }
    }
}
