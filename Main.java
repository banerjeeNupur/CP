import java.io.*;
import java.util.*;

public class Main  {
    
    public static void main(String args[]) throws IOException {

        int amount=5;
        int coins[] = new int[]{1,2,5};
        Arrays.sort(coins);
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<dp.length;j++){
                if(coins[i] > j) continue;
                dp[j] += dp[j-coins[i]];
            }

            for (int v = 0; v < dp.length; v++) {
                System.out.print(dp[v]+"  ");
            }
            System.out.println();
        }

    }

}