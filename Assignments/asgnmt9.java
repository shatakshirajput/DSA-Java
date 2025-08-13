// ASSIGNMENT 9- 2D Arrays

public class asgnmt9 {
    public static int count7(int arr[][]){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    c++;
                }
            }
        }
        return c;
    }
    public static int sumOfNumbers(int nums[][]){
        int sum=0;   
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];   
        }
        return sum;
    }
    public static void transpose(int matrix[][]){
        int r =matrix.length; int c=matrix[0].length;
        int[][] trans = new int[c][r];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Ques1- Print the number of 7 in the 2d array.
        int[][] arr={{4,7,8},
                    {8,8,7}};
        System.out.println(" "+count7(arr));

        //Ques2- Print the sum of the numbers in the second row of the nums array.
        int[][] nums={{1,4,9},
                  {11,4,3},
                  {2,2,3}};
        System.out.println(" "+sumOfNumbers(nums));

        //Ques3- Wap to transpose of matrix.
        int[][] matrix={{11,12,13},
                        {21,22,23},
                        {31,32,33}};
        transpose(matrix);
    }
}
