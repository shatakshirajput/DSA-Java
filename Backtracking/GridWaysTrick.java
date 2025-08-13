public class GridWaysTrick {
    public static int gridWays(int i ,int j,int n,int m) {
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        return fac(n-1+m-1)/(fac(n-1)*fac(m-1));
    }
    public static int fac(int n){
        if (n==0){
            return 1;
        }
        int f = n * fac(n-1);
        return f;
    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println("Total ways: "+gridWays(0, 0, n, m));
    }
}
