//ASSIGNMENT 11- BIT MANIPULATION

public class asgnmt11 {
    public static void main(String[] args) {
        //Ques 1- value of x^x
        // x xor with x ,xor gives zero for same so it will always be zero.

        //Ques 2- Swap two numbers without using third number.
        int x=3; int y=8;
        System.out.println("Numbers before swap " +x+ " , "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("Numbers after swap " +x+ " , "+y);

        //Ques 3- Add 1 to integer using bit manipulation.
        int x1=6;
        System.out.println(x1+" + "+1+" = "+ -~x1);

        //Ques 4- Convert UpperCase characters to lowerCase characters.
        for(char ch='A'; ch<='Z';ch++){
            System.out.print((char)(ch|' '));
        }
    }
}
