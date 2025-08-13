package Recursion;

public class SumOfN {
    public static int count(int n){
        if (n==1) {
            return 1;
        }
        int sum = n + count(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(count(n));
    }
}
