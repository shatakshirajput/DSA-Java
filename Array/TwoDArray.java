import java.util.Scanner;

public class TwoDArray {
    public static boolean search(int matrix[][],int key){
        int rows=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at  cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        //creating
        int matrix[][]=new int[3][3];

        //input
        Scanner sc = new Scanner(System.in);
        int rows=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //search
        search(matrix, 5);
    }
}