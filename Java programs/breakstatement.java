import java.util.Scanner;

public class breakstatement{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println("Multiple of 10 found. Exiting loop.");
                break;
            }
            System.out.println("Not a multiple of 10. Continuing loop.");
        }while(true);
        sc.close();
    }
}
