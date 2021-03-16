package HackeRank;

public class minimumBribes {
    
    public static void main(String[] args) {
        
        int [] q = new int[]{2, 1, 5, 3, 4};//{5, 1, 2, 3, 7, 8, 6, 4};

        int ans=0, flag=0,start=0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                flag = 1;
                return;
            }
            if(q[i]-2>0) start = q[i] - 2;
            else start = 0;
            for (int j = start; j < i; j++)
                if (q[j] > q[i]) ans++;
                //System.out.print(ans+"  ");
        }
        

        if(flag == 1) System.out.println("\nToo chaotic");
        else System.out.println("\n"+ans);

    }
}