// Complexity : O(n)

import java.io.*;

public class wiggleSub {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size of array: ");
        int n = Integer.parseInt(br.readLine());

        int nums[] = new int[n];
        System.out.println("enter numbers");
        String s[] = br.readLine().trim().split("\\s+");
        for(int i=0;i<n;i++) nums[i] = Integer.parseInt(s[i]);

        System.out.println("Max length: "+func(nums));
    }

    public static int func(int[] nums) {
        
        if(nums.length == 0) return 0;

        // prev_up at i: max length of subsequence till (i-1) index, considering that current element is an Up point
        // prev_down at i: max length of subsequence till (i-1) index, considering that current element is an Down point
        int prev_up=1, prev_down=1;
        
        for(int i=1;i<nums.length;i++){
            
            // up
            if(nums[i-1] < nums[i]){
                prev_up = prev_down+1;   
            }
            // down
            else if(nums[i-1] > nums[i]){
                prev_down = prev_up+1;
            }
        }
        
        return Math.max(prev_up,prev_down);
    }
}
