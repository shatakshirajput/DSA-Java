package Recursion;

public class Factorial {
    public static int fac(int n){
        if (n==0){
            return 1;
        }
        int f = n * fac(n-1);
        return f;
    }
    public static void main(String[] args) {
        int f=5;
        System.out.println(fac(f));
    }
}
