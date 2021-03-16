public class matrixMul {

    public static void main(String[] args) {
        
        int num [] = new int[]{40,20,30,10,30};
        int dp[][] = new int[6][6];

        System.out.println("Multiplications: "+mul(num,dp));
    }

    public static int mul(int num[], int dp[][]){

        for(int i=1;i<num.length;i++) dp[i][i] = 0;

        
        return 0;
    }
}
