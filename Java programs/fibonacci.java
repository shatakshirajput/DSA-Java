import java.util.*;

public class fibonacci {
    public static void fib (int num){
        int n1=0;
        int n2=1;
        int n3;
        for(int i=1;i<=num;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series:");
        System.out.print(0+" "+1);
        fib(n-2);
        sc.close();     
    }
}
