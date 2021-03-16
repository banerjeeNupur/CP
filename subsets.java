import java.util.*;

public class subsets {
    
    public static void main(String[] args) {
        
        int [] nums = new int[]{1,2,3};
        int len = nums.length, i=0;
        int subset = (int)Math.pow(2,len) - 1;
        int total = subset+1;
        //String s = Integer.toBinaryString(subset);

        System.out.println(len);
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        while(i<total){
            String s = Integer.toBinaryString(subset);
            

            while(s.length()<len) s = "0"+s;
            System.out.println(s);
            int slen = s.length(), j=0;
            List<Integer> temp = new ArrayList<>();
            while(j<slen){
                if(s.charAt(j) == '1'){
                    temp.add(nums[j]);
                }
                j++;
            }
            
            ans.add(temp);
            i++;
            subset--;
            
            
        }
        
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}