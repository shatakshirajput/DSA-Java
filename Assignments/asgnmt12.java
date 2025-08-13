//ASSIGNMENT 12- OOPS

//Ques 1- Print sum,diff,product of two complex numbers by creating a class named 'Complex' with separate methods for each operations.
import java.util.*;
class Complex{
    int real;
    int imag;
    public Complex(int r,int i){
        real=r;
        imag=i;
    }
    public static Complex sum(Complex a, Complex b) {
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real*b.real)-(a.imag*b.imag),(a.real+b.imag)+(a.imag*b.real));
    }
    public void printComplex(){
        if (real==0 && imag !=0){
            System.out.println(imag+"i");
        }
        else if (real!=0 && imag ==0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}
public class asgnmt12{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the real part of first complex number: ");
       int n1r=sc.nextInt();
       System.out.println("Enter the imaginary part of first complex number: ");
       int n1i=sc.nextInt();
       Complex a=new Complex(n1r,n1i);
       System.out.println("Enter the real part of second complex number: ");
       int n2r=sc.nextInt();
       System.out.println("Enter the imaginary part of second complex number: ");
       int n2i=sc.nextInt();
       Complex b=new Complex(n2r,n2i);

       Complex add = Complex.sum(a, b);
       Complex minus = Complex.diff(a, b);
       Complex multiply = Complex.product(a, b);

       System.out.println("Addition :");
       add.printComplex();
       System.out.println("Difference :");
       minus.printComplex();
       System.out.println("Product :");
       multiply.printComplex();

       sc.close();
    }
}

//Ques 2- Output- B. Driving electric car.

//Ques 3- Output- B. Public and protected.

//Ques 4- Output- C. 13245.

