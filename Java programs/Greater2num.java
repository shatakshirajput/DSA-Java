import java.util.Scanner;

public class Greater2num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        sc.close();
        if (a==b){
            System.out.println("Equal numbers");
        }
        else if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else {
            System.out.println(a+" is less than "+b);
        }
        //or
        //int max = Math.max(a,b);
    }
}
