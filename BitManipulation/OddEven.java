public class OddEven{
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(32);
        oddOrEven(31);
        oddOrEven(0);
    }
}