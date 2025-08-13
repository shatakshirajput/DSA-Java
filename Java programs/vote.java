import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age>=0&&age<18){
            System.out.println("Not eligible to vote.");
        }
        else if(age>=18){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Enter valid age.");
        }
        sc.close();
    }
}
