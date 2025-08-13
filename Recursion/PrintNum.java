package Recursion;

public class PrintNum {
    public static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=10;
        printDecreasing(n);
        printIncreasing(n);
    }
}
