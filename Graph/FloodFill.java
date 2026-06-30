package Graph;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean visited[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,visited,image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color,boolean vis[][] , int orgCol){
        if(sr<0 || sc<0 || sr >=image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }
        image[sr][sc] = color;

        // left
        helper(image, sr, sc-1, color, vis, orgCol);

        // ryt
        helper(image, sr, sc+1, color, vis, orgCol);

        // up
        helper(image, sr-1, sc, color, vis, orgCol);

        // down
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    public static void main(String[] args){
        // run on 733 leetcode 
    }
}