// sum of power that is the number of digits in the given number, of the digits is equal to the number itself thn it is an armstrong number...

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int sum = 0 ;
        int org = a;
        while (a>0) {
            int rem = a%10;
            int cube = rem*rem*rem;
            sum = sum+cube;
            a=a/10;
        }
        if (sum!=org){
            System.out.println("Not an arstrong number");
        }
        else{
            System.out.println("Armstrong number");
        }
        sc.close();
    }
}
