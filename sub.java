import java.util.*;
public class sub {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,5,11,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++) sum += arr[i];
        sum = sum/2;
        int dp[]= new int[sum+1];
        
        func(arr,dp,arr.length,0,sum);
        
        System.out.println(dp[sum]);
    }

    public static int func(int arr[], int dp[], int n, int start, int target){
        
        if(target == 0) return 0;
        
        if(target <0) return -1;
        
        if(dp[target]!=0) return dp[target];
        
        int res = Integer.MAX_VALUE;
        for(int i=start;i<n;i++){
            
            if(arr[i]<=target){
                int min = func(arr,dp,n,i+1,target-arr[i]);
                
                if(min >= 0 && min <res) {
                    res = min+1;
                }
            }
            dp[target] = res;//(res == Integer.MAX_VALUE)?-1:res;
        }
        
        return dp[target];
    }
}
