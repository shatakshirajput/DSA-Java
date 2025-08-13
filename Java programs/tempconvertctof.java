//temperature conversion from celsius to farenhiet...

import java.util.Scanner;

public class tempconvertctof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:-");
        float tempcelsius = sc.nextFloat();
        float tempfarenhiet = (tempcelsius * 9/5 ) + 32 ;
        System.out.println("Temperature in farenhiet is: "+ tempfarenhiet);
        sc.close();
    }
}
