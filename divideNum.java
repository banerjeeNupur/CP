public class divideNum {
    
    public static void main(String[] args) {
        
        System.out.println(divide(17, 3));
    }

    public static int divide(int A, int B){

        int sign = (A<0 ^ B<0)?-1:1;
        long m = Math.abs((long)A);
        long n = Math.abs((long)B);
        long t=0;
        long q=0;
        for(long i=31;i>=0;i--) {
            if((t+(n<<i))<=m) {
                System.out.println(t+"   "+ (n<<i)+"   "+i);
                t+=(n<<i);
                q = q|(1L<<i);
            }
        }
        if(sign<0)q=-q;
        if(q>=Integer.MAX_VALUE || q<Integer.MIN_VALUE)return Integer.MAX_VALUE;
        return (int)q;
    }
}