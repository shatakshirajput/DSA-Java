import java.util.Scanner;

public class simplecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the action to be performed :");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        int x = sc.nextInt();
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (x==1){
            int s = a+b;
            System.out.println("Sum:"+s);
        }
        if (x==2){
            int sb = a-b;
            System.out.println("Difference:"+sb);
        }
        if (x==3){
            int m = a*b;
            System.out.println("Product:"+m);
        }
        if (x==4){
            int d = a/b;
            System.out.println("Quotient:"+d);
        }
        if (x==5){
            int mo = a%b;
            System.out.println("Remainder:"+mo);
        }
    }
}
