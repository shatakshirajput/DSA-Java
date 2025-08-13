import java.util.Scanner;

public class sumNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        for(int i =1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum: "+sum);
    }
}
