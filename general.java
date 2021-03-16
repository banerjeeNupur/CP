import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class general {
    
    public static void main(String[] args) {

        int amount=5;
        int coins[] = new int[]{1,2,5};
        Arrays.sort(coins);
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j] > i) continue;
                dp[i] += dp[i-coins[j]];
            }

            for (int v = 0; v < dp.length; v++) {
                System.out.print(dp[v]+"  ");
            }
            System.out.println();
        }

        
    }
    
    
    
}
