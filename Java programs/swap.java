import java.util.Scanner;

public class swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the two numbers to swap:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp=num1;
        num1 = num2;
        num2=temp;
        System.out.println("After swapping numbers are: " + num1 +","+ num2);
        sc.close();
    }
}