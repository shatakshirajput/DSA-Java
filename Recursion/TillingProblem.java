package Recursion;

public class TillingProblem {
    public static int tillingProb(int n){
        if (n==0|| n==1) {
            return 1;
        }
        int fnm1= tillingProb(n-1);
        int fnm2= tillingProb(n-2);
        int total= fnm1 + fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(" "+tillingProb(4));
    }
}