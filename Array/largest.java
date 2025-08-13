public class largest {
    public static int arrayLargestNum(int number[]) {
        int largestnum= Integer.MIN_VALUE;
        for (int i =0;i<number.length;i++){
            if(largestnum<number[i]){
                largestnum=number[i];
            }
        }
        return largestnum;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        System.out.println("Largest element in the array is: "+arrayLargestNum(number));
    }
}
