import java.util.*;

public class factorial {
    public static void Factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial is: "+f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x<0){
            System.out.println("Enter valid number...");
        }else if(x==0){
            System.out.println("Factorial is: 1");
        }else{
            Factorial(x);
        }
        sc.close();
    }
}
