import java.util.HashMap;



public class minWindow {
    
    public static void main(String[] args) {
        
        String s = "ADOBECODEBANC";
        String t = "ABC";

        // if(t.length()>s.length()) return "";
        HashMap<Character,Integer> req = new HashMap<>();
        HashMap<Character,Integer> pres = new HashMap<>();
        
        
        int i=0,unique=0;
        
        while(i<t.length()){
            char c = t.charAt(i);
            int temp = req.getOrDefault(c,0);
            // if(temp == 0) unique++;
            req.put(c,temp+1);
            i++;
        }

        int start=0, end=0,len=Integer.MAX_VALUE,avail=0;
        int st=0,e=0,flag=0;
        
        while(start<=end && end<s.length()){
            char c = s.charAt(end);
            // if(!req.containsKey(c)) end++;
            if(req.containsKey(c)){
                int r = req.get(c);
                int p = pres.getOrDefault(c,0);
                pres.put(c,p+1);
                
                if(p<r){
                    avail++;
                    System.out.print("avail: "+avail+" char is : "+c);
                }
                
            }
            end++;            
            while(avail==t.length()){
                System.out.println("in here");
                flag=1;
                if(len>end-start){
                    len = end-start;
                    st = start;
                    e = end;
                }
                char ch = s.charAt(start);
                
                if(pres.containsKey(ch)){
                    int co = pres.get(ch);
                    pres.put(ch,co-1);
                    if(co == req.get(ch)) avail--;
                }
                
                start++;
                
            }
            

        }
        System.out.println(s.substring(st,e));
        // if(flag==0) return "";
        // return s.substring(st,e);
    }
}
