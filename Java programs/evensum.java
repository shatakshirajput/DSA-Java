import java.util.*;

public class evensum {
    public static void es(int n){
        int evensum =0;
        for(int i =0;i<=2*n;i++){
            if (i%2==0){
                evensum+=i;
            }
        }
        System.out.println("Sum of even numbers from 0 to "+n+" is "+evensum);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit of even numbers from 0 to ");
        int a = sc.nextInt();
        es(a);
        sc.close();
    }
}
