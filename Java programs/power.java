//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n
import java.util.Scanner;

public class power {
    public static void p(int num,int exp){
        double a = Math.pow(num, exp);
        System.out.println(num+" raise to power "+exp+" is: "+a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        p(x, n);
        sc.close();
    }
}