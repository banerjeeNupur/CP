package HackeRank;

public class plusMinus {

    public static void main(String[] args) {
        
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};

        int n = arr.length;
        int pos=0, neg=0, zero=0;

        for(int i =0 ; i<n ; i++){
            System.out.println(pos+"  "+neg+"  "+zero);
            if(arr[i]<0) neg++;
            else if(arr[i]>0) pos++;
            else zero++;
        }


        System.out.println("final");
        System.out.println(pos+"  "+neg+"  "+zero);
        float ans = pos/(float)n;
        System.out.println(ans);

        ans = neg/n;
        System.out.println(ans);

        ans = zero/n;
        System.out.println(ans);
    
    }
    
    


}