import java.util.*;

public class oddsum {
    public static void os(int n){
        int sum=0;
        for (int i=0;i<=2*n;i++){
            if(i%2!=0){
                sum=sum+i; 
            }    
        }
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of odd numbers: ");
        int a = sc.nextInt();
        os(a);
        sc.close();
    }
}
