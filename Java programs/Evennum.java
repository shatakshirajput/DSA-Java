import java.util.Scanner;

public class Evennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
