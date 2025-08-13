package Recursion;

public class Fibbonaci {
    public static int fib(int n){
        int fibonaci;
        if(n==0 || n==1){
            return n;
        }
        fibonaci = fib(n-1)+fib(n-2);
        return fibonaci;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(" "+fib(n));
    }
}
