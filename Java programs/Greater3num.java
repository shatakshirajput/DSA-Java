import java.util.Scanner;

public class Greater3num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        sc.close();
        if (a>b){
            if (a>c){
                System.out.println(a+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        else{
            if (b>c){
                System.out.println(b+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        //or
        //int max = Math.max(c,Math.max(a,b));
    }
}
