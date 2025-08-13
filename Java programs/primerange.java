public class primerange {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }else if((n==1)||(n==2)){
            return true;
        }
        else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void primeRange(int start, int end){
        for (int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        primeRange(3,16);
    }
}
