import java.io.*;
import java.util.Arrays;

public class mergeSort {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numbers: ");
        String s[] = br.readLine().trim().split(" ");
        int num [] = new int[s.length];
        
        for (int i = 0; i < s.length; i++) num[i] = Integer.parseInt(s[i]);
        mSort(num, 0, s.length-1);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static void mSort(int [] num, int l, int r){

        if(l<r){
            int m = (l+r)/2;

            mSort(num,l,m);
            mSort(num, m+1, r);
            merge(num,l,m,r);
        }
        
    }

    public static void merge(int [] num, int l, int m, int r){

        int [] left = Arrays.copyOfRange(num, l, m+1);
        int [] right = Arrays.copyOfRange(num, m+1, r+1);
        
        int i=0, j=0, k=l;

        while(i<left.length && j<right.length){

            if(left[i] <= right[j])
                num[k++] = left[i++];
            
            else num[k++] = right[j++];
        }

        while(i<left.length) num[k++] = left[i++];
        while(j<right.length) num[k++] = right[j++];
        
    }
}
