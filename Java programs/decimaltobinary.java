import java.util.*;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n=sc.nextInt();
        System.out.println("Binary is:"+decitobin(n));
        sc.close();
    }
    public static int decitobin(int n){
        int binary=0;
        int pow=0;
        while(n>0){
            int rem=n%2 ;
            binary+=rem*Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        return binary;
    }
}
