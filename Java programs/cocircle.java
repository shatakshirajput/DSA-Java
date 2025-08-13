//program to print the circumference and area of a circle

import java.util.Scanner;

public class cocircle {
    public static void ccircle(int r){
        double c = 2* 3.14 *r; 
        System.out.println("Circumference of the circle with the radius "+r+" is "+c);
    }
    public static void aocircle(int r){
            double a = 3.14 * r * r; 
            System.out.println("Area of the circle with the radius "+r+" is "+a);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r= sc.nextInt();
        ccircle(r);
        aocircle(r);
        sc.close();
    }
}
