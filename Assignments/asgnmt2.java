// Assignment 2 VARIABLES AND DATA TYPES

import java.util.Scanner;

public class asgnmt2{
    public static void main(String[] arg){
        //Question 1 In a program, input 3 numbers: A, B, C. Write a program to calculate the average of the 3 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a+b+c);
        int avg =sum/3;
        System.out.println("Average of the 3 numbers is: "+avg);

        //Question 2 In a program, input the side of the square. Write a program to calculate the area of the square.
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of the square is: "+area);

        //Question 3 enter the cost of three items from the user (float datatype)- a pencil,a pen and an eraser. Calculate the total cost of the three items and display it as therir bill.(Add on also try adding 18% gst to the items in the bill).
        System.out.println("Enter the cost of a pencil, pen and eraser: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("Total cost of the three items is(without gst): "+total);
        float gst = (float) (total*0.18);
        float total_bill = total+gst;
        System.out.println("Total cost of the three items is(with gst of 18%): "+total_bill);

        //Question 4 result = (f*b)+(i%c)-(d*s) where f is float, b is byte, i is int, c is char, d is double and s is short.
        // the ans will be a double value.

        //Question 5 Will it be an error in java - int $=24;
        int $ = 24;
        System.out.println("It will not be an error "+$);
        sc.close();

    }
}
