public class revBits {
    
    public static void main(String[] args) {
        
        long a = 3;
        String binary = Long.toBinaryString(a);
        int len = binary.length(), i =0;
        StringBuilder str = new StringBuilder();
        
        i = len-1;
        while(i>=0){
            str.append(binary.charAt(i));
            i--;
        }
        i=0;
        while(i<32-len){
            str.append("0");
            i++;
        }

        
        
        binary = str.toString();
        System.out.println(binary);
        
        //System.out.println(Long.parseLong(binary));
        int j=0;
        long sum=0;
        i=31;
        while(i>=0){
            if(binary.charAt(i) == '1') sum += (long)Math.pow(2,j); 
            
            j++;
            i--;
        }

        System.out.println(sum);
        
    }
}