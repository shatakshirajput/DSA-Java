public class SubArrays {
    public static void printSubArrays(int num[]){
        int ts=0;
        for (int i=0;i<num.length;i++){ //start element
            for (int j=i;j<num.length;j++){ //end elements
                for (int k=i;k<=j;k++){ //printing 
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total sub arrays: "+ts);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        printSubArrays(num);
    }
}
