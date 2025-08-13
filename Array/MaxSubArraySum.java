public class MaxSubArraySum {
    public static void bruteForceApproach(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){ 
            for (int j=i;j<numbers.length;j++){ 
                currSum=0;
                for (int k=i;k<=j;k++){ 
                    currSum+=numbers[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }   
        }
        System.out.println("Maximum sub arrays sum(bruteforce): "+maxSum);
    }
    public static void PrefixSumApproach(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        //finding prefix array
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i=0;i<numbers.length;i++){ 
            for (int j=i;j<numbers.length;j++){ 
                currSum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }   
        }
        System.out.println("Maximum sub arrays sum(prefix sum): "+maxSum);
    }
    public static void kadaneAlgo(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Maximum sub arrays sum(kadane): "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        bruteForceApproach(numbers);
        PrefixSumApproach(numbers);
        kadaneAlgo(numbers);
    }
} 