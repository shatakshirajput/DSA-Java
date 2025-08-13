package Recursion;

public class BinaryStrings {
    public static void bin(int n,int last,String str){
        // if(last==0){
        //     bin(n-1, 0, str.append("0"));
        //     bin(n-1, 1, str.append("1"));
        // }
        // else{
        //     bin(n-1, 0, str.append("0"));
        // }
        if(n==0){
            System.out.println(str);
            return;
        }
        bin(n-1, 0, str+"0");
        if(last==0){
            bin(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        bin(3, 0, "");
    }
}
