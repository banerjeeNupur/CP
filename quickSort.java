import java.io.*;

public class quickSort {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numbers: ");
        String s [] = br.readLine().trim().split("\\s+");
        int num [] = new int[s.length];
        for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(s[i]);

        sort(num,0,num.length-1);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        
    }

    public static void sort(int [] num, int l, int r){

        if(l<r){

            int p = partition(num,l,r);

            sort(num,l,p-1);
            sort(num,p+1,r);
        }
    }

    public static int partition(int num[], int l, int r){

        int i=l-1, pivot = num[r];
        for (int j = l; j < r; j++) {
            
            if(num[j]<=pivot){
                i++;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }

        i++;
        int temp = num[r];
        num[r] = num[i];
        num[i] = temp;

        return i;
    }
}
