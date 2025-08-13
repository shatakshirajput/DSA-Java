package Recursion;

public class FriendPair {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;
        int total=fnm1+pairWays;
        return total;
    }
    public static void main(String[] args) {
        int f=10;
        System.out.println(" "+pair(f));
    }
}
