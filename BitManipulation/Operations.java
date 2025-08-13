public class Operations {
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)== 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }
    public static int clearIthBits(int n,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeOfBits(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b =(i<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        // get ith bit 
        System.out.println(" "+getIthBit(10, 3));
        //set ith bit
        System.out.println(" "+setIthBit(10, 2));
        //clear ith bit
        System.out.println(" "+clearIthBit(10, 1));
        //update ith bit
        System.out.println(" "+updateIthBit(10, 2,1));
        System.out.println(" "+updateIthBit(10, 2,0));
        //clear range of bits
        System.out.println(" "+clearRangeOfBits(10,2,4));
    }
}
