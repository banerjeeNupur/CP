import java.util.*;
import java.io.*;

public class longestPath {
    
    public static int ans=0;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String st[] = br.readLine().trim().split("\\s+");
        int num[] = new int[n+1];
        for (int i = 1; i < num.length; i++) num[i] = Integer.parseInt(st[i-1]); 
            
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();

        for (int i =1; i<=n ;i++) adj.put(i, new ArrayList<Integer>()); 
        for (int i = 0; i < n-1; i++) {
            String t[] = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(t[0]);
            int v = Integer.parseInt(t[1]);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int div[] = new int[n+1];
        int dp[] = new int[n+1];
        for(int i=1;i<n+1;i++) if(num[i]%k == 0) div[i] = 1;

        dfs(adj, div, 1, 0,dp);
        System.out.println(ans-1);

    }

    public static void dfs(HashMap<Integer,ArrayList<Integer>> adj, int div[], int source, int parent, int []dp){

        dp[source] = div[source]; // if the current node is divisible by k, dp[i] will be 1. will take care of leaf nodes that have div = 1
        int max1=0,max2=0;

        for(int i=0;i<adj.get(source).size();i++){
            if(adj.get(source).get(i) == parent) continue;
            int new_source = adj.get(source).get(i);
            
            dfs(adj,div,new_source,source,dp);
            // --------------------------------------------------------------------------------
            if(div[source] == 1)
                dp[source] = Math.max(dp[source], 1 + dp[new_source]);
            if(dp[new_source] > max1){
                max2 = max1;
                max1 = dp[new_source];
            }
            else if(dp[new_source] > max2) max2 = dp[new_source];

            ans = Math.max(ans,dp[source]);
            System.out.println(source+" --> "+new_source+"  max1: "+max1+"  max2: "+max2+"  ans: "+ans);
            if(div[source]==1)
                ans = Math.max(ans, max1 + max2 + 1);
        }


    }
}
