import java.util.*;

public class average {
    public static void avg(int n1,int n2,int n3){
        int sum = (n1+n2+n3);
        int a = sum/3;
        System.out.println("Average is: "+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        avg(b,c,d);
        sc.close();
    }
}
