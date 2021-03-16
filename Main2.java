import java.util.*;

public class Main2 {
    
    public static void main(String[] args) {
        
        int [] arr1 = new int[]{1,2,3,4,7,9};
        int [] arr2 = new int[]{0,1,2,1,1,4};

        Arrays.sort(arr2);
       
       ArrayList<Integer> ans = new ArrayList<Integer>();
       int index=0;
       for(int i=0;i<arr1.length;i++){
           
                index = lastIndex(arr2,arr1[i],0,arr2.length-1);
                //if(arr2[index] == arr1[i])ans.add(index);
                //else ans.add(ans.get(ans.size()-1)+1);
                ans.add(index+1);
       }
     
       for (int i : ans) {
           System.out.print(i+"  ");
       }
    }

    public static int lastIndex(int [] arr, int num, int start, int end){
        // 1 2 3 4 7 9     // 0 1 1 1 2 4
        int mid=0;
        
        while(start<=end){
            //System.out.print("in");
            mid = (start+end)/2;
            
            if(arr[mid] <= num ) start = mid+1;
            else  end = mid-1;
        }
        
        return end;
    }
}
