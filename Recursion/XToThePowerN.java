package Recursion;

public class XToThePowerN{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

    //OPTIMIZED - O(log N)
    public static int optimizedPower(int x,int n){
        if (n==0) {
            return 1;
        }
        int op=optimizedPower(x, n/2);
        int halfPower=op * op;
        if(n%2!=0){
            halfPower=x*halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args){
        int x=3;
        int n=5;
        System.out.println(" "+power(x,n));
        System.out.println(" "+optimizedPower(x,n));
    }
}