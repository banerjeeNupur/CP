//import java.io.*;

public class maxProduct {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{6,-3,-10,0,2};
        int min=arr[0], max=arr[0],ans =arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(arr[i],min*arr[i]);
            max = Math.max(arr[i],max*arr[i]);
            ans = Math.max(ans,max);
            System.out.println("arr[i]: "+arr[i]+"  min: "+min+"  max:"+max);
        }
        System.out.println("answer: "+ans);
    }
}
