import java.io.*;

public class knapsack {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());

        while(cases>0){

            int n = Integer.parseInt(br.readLine()); // number of items
            int weight = Integer.parseInt(br.readLine()); // weight
            
            String s[] = br.readLine().trim().split("\\s+"); // profit string
            int p[] = new int[n]; // profit array
            for(int i=0;i<n;i++){
                p[i] = Integer.parseInt(s[i]);
            }

            String st[] = br.readLine().trim().split("\\s+"); // profit string
            int w[] = new int[n]; // profit array
            for(int i=0;i<n;i++){
                w[i] = Integer.parseInt(st[i]);
            }

            System.out.println("Max profit: "+maxProfit(w,p,n,weight));

            cases--;
        }
    }

    public static int maxProfit(int w[], int p[], int items, int weight){

        if(items == 0 || weight == 0) return 0;
        if(w[items-1] > weight)  return maxProfit(w, p, items-1, weight);
        return Math.max(p[items-1] + maxProfit(w, p, items-1, weight-w[items-1]),maxProfit(w, p, items-1, weight));


    }
}
