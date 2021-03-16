import java.math.BigInteger;


public class versionNum {
    
    public static void main(String[] args) {
        
        String A = "4.2";
        String B = "4.2.0001";

        A = A.trim(); B = B.trim();
        
        int res = compareVersion(A, B);

        System.out.println(res);
    }

    public static int compareVersion(String A, String B){

        String[] sA = A.split("[.]");
        String[] sB = B.split("[.]");

        BigInteger nA = new BigInteger("1");
        BigInteger nB = new BigInteger("1");

        int lA = sA.length, lB = sB.length, i =0;


        while(lA>0 && lB>0){

            nA = new BigInteger(sA[i]);
            nB = new BigInteger(sB[i]);

            if(nA.compareTo(nB) == 1) return 1;
            else if(nA.compareTo(nB) == -1) return -1;

            lA--; 
            lB--;
            i++;

        }

        // B is still to be parsed
        if(lB>0 && lA==0){

            while(lB>0){
                if(Integer.parseInt(sB[i]) != 0) return -1;
                lB--;
            }
            return 0;
        }


        // A is still to be parsed
        if(lA>0 && lB==0){
            while(lA>0){
                if(Integer.parseInt(sA[i]) != 0) return 1;
                lA--;
            }
            return 0;

        }


        return 0;
    }
} 