//Assignment 5 - LOOPS
import java.util.*;

public class asgnmt5 {
    public static void main(String args[]){
        //Ans 1 it is printed two times.

        //Ques 2 - Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        int choice ;
        int evenSum = 0;
        int oddSum = 0;
        do{
            int n = sc.nextInt();
            if(n%2==0){
                evenSum +=n;
            }
            else{
                oddSum +=n;
            }
            System.out.println("Do you want to continue? (y(1)/n(0))");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);

        //Ques 3 - Write a program to print the factorial of a number n.
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

        //Ques 4 - Write a program to print the multiplication table of a number n.
        n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }

        //Ques 5 - no the variable will not be printed outside the loop as it is only decalred inside the loop.
        sc.close();
    }
}


