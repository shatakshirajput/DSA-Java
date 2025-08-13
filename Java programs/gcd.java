//Write a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.*;

public class gcd {
    public static void greatestCommonDivisor(int num1, int num2){
        int hcf = 1;
        for(int i =1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("Greatest common divisor of "+num1+" and "+num2+ " is "+hcf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        greatestCommonDivisor(n1, n2);
        sc.close();
    }
}
