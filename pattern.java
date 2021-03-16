import java.util.*;
public class pattern {
    
    public static void main(String[] args) {
  
        String S = "ADOBECODEBANC";
        String P = "ABC";
        HashMap<Character,Integer> map = new HashMap<>();
        int lenS = S.length();
        int lenP = P.length();
        int start=0,end=0,count=0;
        
        int i=0,j=0,len=Integer.MAX_VALUE;
        while(j<lenS && i<=j){
            
           
            String t = Character.toString(S.charAt(j));
            if(P.contains(t)){
                int c = map.getOrDefault(S.charAt(j),0);
                map.put(S.charAt(j),c+1);
                if (c==0) count++; // element found for the first time
            }
            j++;
            while(count == lenP){
                if(len>j-i){
                    len = j-i;
                    start = i;
                    end = j;
                    
                }
            
            
                if(map.containsKey(S.charAt(i))){
                    int c = map.get(S.charAt(i));
                    map.put(S.charAt(i),c-1);
                    if (c == 1) count--; // only 1 copy of the element was there
                }
                
                i++;
            }
            
            
        }
        
        System.out.println(start+"  "+end);
        System.out.println(S.substring(start,end));
    }
}
