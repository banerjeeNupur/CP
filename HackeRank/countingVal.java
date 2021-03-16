package HackeRank;
public class countingVal {
    
    public static void main(String[] args) {
        
        String s = "UDDDUDUU";

        // DDUUDDUDUUUD
        int n = s.length(), level = 0, ans =0;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'U') level++;
            if(s.charAt(i) == 'D') level--;

            if(level>0) ans++;
            System.out.print(ans+"  ");
        }


    }
}