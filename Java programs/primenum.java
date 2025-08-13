import java.util.Scanner;

public class primenum {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }else if((n==1)||(n==2)){
            return true;
        }
        else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
        sc.close();
        
    }
}
