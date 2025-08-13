import java.util.Scanner;

public class tempconvertftoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in farenhiet:-");
        float tempfarenhiet = sc.nextFloat();
        float tempcelsius = (tempfarenhiet - 32)*5/9 ;
        System.out.println("Temperature in celsius is: "+ tempcelsius);
        sc.close();
    }
}
