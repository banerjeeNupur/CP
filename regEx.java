public class regEx {
    
    public static void main(String[] args) {
        
        String s = "aa";
        String p = "a*";

        boolean [][] ans = new boolean[s.length()+1][p.length()+1];
        
        ans[0][0] = true;
        
        for (int i = 1; i <= p.length(); i++) {
            if (p.charAt(i-1) == '*')
                ans[0][i] = ans[0][i-2];
            
        }
        
        for(int i=1;i<=s.length();i++){
            
            for(int j=1;j<=p.length();j++){
                
                if(p.charAt(j-1) == '.' || s.charAt(i-1) == p.charAt(j-1)){
                    ans[i][j] = ans[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    
                    ans[i][j] = ans[i][j-2];
                    if(p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1))
                        ans[i][j] |= ans[i-1][j];
                }
                else ans[i][j] = false;
            }

            // for (int j = 0; j < ans[i].length; j++) {
                
            //     System.out.print(ans[i][j]+"    ");
            // }
            // System.out.println();
        }
        
        
        for (int i = 0; i < ans.length; i++) {
            
            for (int j = 0; j < ans[i].length; j++) {
                
                System.out.print(ans[i][j]+"    ");
            }
            System.out.println();
        }       
    }
}
