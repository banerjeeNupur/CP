public class kPal {
    
    public static void main(String[] args) {
        
        String a = "abxy";
        String b = "bayx";

        boolean [][] dp_a = new boolean[a.length()][a.length()];
        boolean [][] dp_b = new boolean[b.length()][b.length()];

        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(j<i) dp_a[i][j] = true;
                else dp_a[i][j] = isPal(a.substring(i, j+1));
            }
        }

        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                System.out.print(a.substring(i, j+1)+"  "+dp_a[i][j]+"  ");
            }
            System.out.println();
        }

        

    }

    

    public static boolean isPal(String a){

        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}
