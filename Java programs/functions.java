import java.util.*;

//normal use of functions and printing name, adding two numbers,difference of two numbers, multiply two numbers
public class functions {
    public static void printMyName(String name){               //printMyName is written in camelcase means first letter capital of a new word
        System.out.println(name);
        return;
    }
    public static void add2Num(int num1,int num2){
        System.out.print("Sum is: ");
        System.out.println(num1+num2);
    }
    public static int diff2Num(int num1,int num2){
        return num1-num2;
    }
    public static void multiply2Num(int num1,int num2){
        System.out.print("Product is: ");
        System.out.println(num1*num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = sc.next();
        printMyName(a);
        System.out.print("Enter the numbers:" );
        int c = sc.nextInt();
        int b = sc.nextInt();
        add2Num(c,b);
        multiply2Num(c, b);
        System.out.println("Difference is: "+diff2Num(c, b));
        sc.close(); 
    }
}
