//ASSIGNMENT 13- Recursion

public class asgnmt13 {
    public static void allOccurences(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }
    public static void numberName(int num){
        String[] names={"zero","one","two","three","four","five","six","seven"};
        if(num==0){
            return;
        }
        int lastdigit = num%10;
        numberName(num/10);
        System.out.print(names[lastdigit]+" ");
    }
    public static int lengthOfString(String str){
        if(str.length()==0){
            return 0;
        }
        return lengthOfString(str.substring(1))+1;
    }
    public static int substring(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        //Ques 1 - For a given integer array of size N. You have to find all the ocurances of a given element and print them. Use a recursive function to solve this problem.
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        System.out.println("All Occurances ->");
        allOccurences(arr, key, 0);
        System.out.println();
        
        //Ques 2- convert number to number name.
        int num=123456;
        System.out.println("Number Name ->");
        numberName(num);
        System.out.println();

        //Ques 3- WAP to find the length of String using recursion.
        String str="asdfghjk";
        System.out.println("Length of String ->");
        System.out.println(lengthOfString(str));

        //Ques 4- Given a String S, find the count of all contiguous substrings starting and ending with same character.
        String s1 = "abcab";
        System.out.println("Number of req substring -> "+ substring(s1));
        String s2="aba";
        System.out.println("Number of req substring -> "+ substring(s2));

        //Ques 5- Tower Of Hanoi
        
    }
}
