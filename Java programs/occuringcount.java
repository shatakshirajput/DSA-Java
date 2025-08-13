import java.util.Scanner;

public class occuringcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        System.out.print("Enter the digit to count:");
        int b = sc.nextInt();
        int count =0;
        /*while (a > 0) {
            int digit = a%10;
            if (digit==b){
                count++;
            }
            digit = digit /10;
        }*/
        System.out.println("The number "+b+" has occured "+count+" times.");
        sc.close();
        for(int i=a; i>=0;i--){
            int d = a%10;
            if(d==b){
                count++;
            }
            d =d/10;
        }
        
    }
}
