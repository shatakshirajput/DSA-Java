import java.util.Scanner;

public class Evenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        sc.close();
        if (a%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
