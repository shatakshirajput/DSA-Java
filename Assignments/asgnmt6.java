//Assignment 6: FUNCTIONS
import java.util.*;

public class asgnmt6 {
    public static void main(String[] args) {
        //Question 1 write a java function to compute average of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum=(a+b+c);
        int average= sum/3;
        System.out.println("Average of the three numbers is: "+average);
        
        //Ques 2 write a method named isEven that accepts an int argument and returns true if the argument is an even number otherwise returns false.also write a program to test your method.
        System.out.println("Enter a number to check if it is even or not: ");
        int num = sc.nextInt();
        System.out.println("Is the number even? "+isEven(num));

        //Ques 3 write a java program to check if the number is palindrome or not.
        System.out.println("Enter a number to check if it is palindrome or not: ");
        int n = sc.nextInt();
        int temp = n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

        // ans 4 - read exercise(Math.min(),Math.max(),Math.abs(),Math.pow(),Math.sqrt(),Math.avg()).
        
        //Ques 5 write a java program to compute the sum of the digits in an integer.
        System.out.println("Enter a number to find the sum of its digits: ");
        int num1 = sc.nextInt();
        int sum1=0;
        while(num1>0){
            int rem= num%10;
            sum1=sum1+rem;
            num1=num1/10;
        }
        System.out.println("The sum of the digits of the number is: "+sum1);
        sc.close();
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

}
