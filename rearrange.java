
import java.util.*;

import java.io.*;

 class pairComparator implements Comparator<pair>{
        
        public int compare(pair a, pair b){
            if(a.freq<b.freq) return 1;
            else if(a.freq>b.freq) return -1;
            return 0;
        }
    }
    
 class pair{
        
        char c;
        int freq;
        
        pair(char c, int freq){
            this.c = c;
            this.freq = freq;
        }
        
    }


public class rearrange {
    public static void main (String[] args) throws IOException{
		//code
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
		    t--;
		    String str = br.readLine().trim();
		    
		    int res = func(str);
		    System.out.println(res);
		}
	}
	
	
	public static int func(String s){
	    
	    int arr[] = new int[26];
	    for(int i=0;i<s.length();i++){
	        char c = s.charAt(i);
	        arr[c - 'a']++;
        }
        for (int i =0;i<26;i++) {
            System.out.println((char)(i+'a')+"  :  "+arr[i]);
        }
	    PriorityQueue<pair> queue = new PriorityQueue<>(new pairComparator());
	    
	    for(int i=0;i<26;i++){
	        if(arr[i] == 0)continue;
	        char c = (char)(i + 'a');
	        int f = arr[i];
	        queue.add(new pair(c,f));
	    }
	    
	    String res = "";
	    pair prev = new pair('#',-1);
	    while(!queue.isEmpty()){
	        pair p = queue.poll();
	        char ch = p.c;
	        res += ch;
	        System.out.println(res);
	        if(prev.freq > 0) queue.add(prev);
	        
	        (p.freq)--;
	        prev = p;
	        
	    }
	    
	    if(res.length() == s.length()) return 1;
	    return 0;

}
}
