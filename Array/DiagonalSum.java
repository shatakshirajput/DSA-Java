public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum=0;

        // brute force -> O(n^6)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<=matrix[0].length;j++){
        //         //primary diagonal
        //         if(i==j){                  
        //             sum+=matrix[i][j];
        //         }
        //         //secondary diagonal(i+j=n-1)
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //optimal approach ->O(n^2)
        for(int i =0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(" "+diagonalSum(matrix));
    }
}
