import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // array is the collection of same data type values.
        // syntax
        // datatype[] variable_name = new datatype[size];
        int[] arr = new int[5];
        
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for(int i =0 ; i <arr.length;i++){
            arr[i]= sc.nextInt();
        }

        //printing output
        System.out.print("The array is : ");
        for(int i =0 ; i <arr.length;i++){
            System.out.print(arr[i]+" "); 
        }

        // updating value
        arr[1]=45;   //pass any index tht is to be updated and the value to update 
        sc.close();
    }
}