import java.util.Scanner;

public class binomialcoeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is: "+binomial(n,r));
        sc.close();
    }
}
