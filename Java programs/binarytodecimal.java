import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        System.out.println("Decimal is:"+binaryToDecimal(binary));
        sc.close();
    }
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int pow=0;
        while(binary>0){
            int rem= binary%10;
            decimal+=rem*Math.pow(2,pow);
            binary/=10;
            pow++;
        }
        return decimal;
    }
}