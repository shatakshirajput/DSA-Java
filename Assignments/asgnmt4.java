//Assignment 3 - CONDITONAL STATEMENTS
import java.util.Scanner;

public class asgnmt4{
    public static void main(String[] args){
        //Ques 1 - Write a program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive");
        }
        else if (n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        //Ques 2 - Write a program to print you hav e a fever if the temp is above 100 otherwise it prints u dont have fever.
        int temp = sc.nextInt();
        if (temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }

        //Ques 3 - Write a java program to input week number (1-7) and print the day of the week using switch case.
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        //ans 4- the value of x is false and y is 63.

        //ques5 - write a program for checking leap year.
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}




