package HackeRank;

public class minSwaps {
    
    public static void main(String[] args) {
        
        int [] arr = new int[]{2,3,4,1, 5};
        int i=0, temp=0, ans=0;

        while(i<arr.length){

            int exp_index = arr[i]-1;
            if(exp_index == i) i++;
            else{
                temp = arr[exp_index];
                arr[exp_index] = arr[i];
                arr[i] = temp;
                ans++;
            }
        }

        System.out.println(ans);
    }
}