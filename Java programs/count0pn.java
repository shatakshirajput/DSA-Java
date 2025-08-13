//program to enter the numbers and should display count of positive, negative and zeros entered.
import java.util.*;

public class count0pn{
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int z=0;
        int p=0;
        int n=0;
        String ch;
        do{
            if(num==0){
                z++;
            }
            else if(num<0){
                n++;
            }
            else{
                p++;
            }
            System.out.println("Do you want to continue?(y/n)");
            ch = sc.next();
        }while(ch=="y");
        System.out.println("Positive numbers entered: "+p);
        System.out.println("Negative numbers entered: "+n);
        System.out.println("Zeros entered: "+z);
        sc.close();
    }
}