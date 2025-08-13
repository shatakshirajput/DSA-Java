// ASSIGNMENT 10- Strings
import java.util.Arrays;

public class asgnmt10 {
    public static void main(String[] args) {
        //Ques 1- Count how many times lowercase vowels occurred in a String entered by the user.
        String str= "InFinITy";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o'|| str.charAt(i)=='u' ){
                count++;
            }
        }
        System.out.println("The lowercase vowels are "+ count);

        //Ques 2- Output - false true

        //Ques 3- Output - Apnacoege

        //Ques 4- Anagram program (same letters different words)
        String str1="Earth";
        String str2="Heart";
        //converting to lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1charArray= str1.toCharArray();
            char[] str2charArray= str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1+ " and " +str2+ " are anagrams");
            }
            else{
                System.out.println("Not anagrams");
            }
       }
       else{
            System.out.println("Not anagrams");
       }
    }
}
