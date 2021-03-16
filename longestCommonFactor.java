import java.io.*;
import java.util.*;

public class longestCommonFactor {
    
    public static void main(String[] args) throws IOException {
        
        // Take space separated integers as the input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Size of array: ");
        int size = Integer.parseInt(br.readLine());
        int num[] = new int[size];
        System.out.println("Enter elements: ");
        String s[] = br.readLine().trim().split("\\s+");
        for(int i=0;i<size;i++) num[i] = Integer.parseInt(s[i]);

        int maxSize = 1; // max component size

        // mapping element to root
        Map<Integer,Integer> parent = new HashMap<>();

        // O(n) * O(sqrt(n))
        for (int el : num)
            for (int fact = 2; fact*fact<=el; fact++)
                if (el % fact == 0){
                    union(el,fact,parent);
                    union(el,el/fact,parent);
                }

        
        Map<Integer,Integer> freq = new HashMap<>();
        for (Integer v : num) {
            int f = find(v,parent);
            if (freq.containsKey(f)) {
                freq.put(f, freq.get(f)+1);
                maxSize=Math.max(maxSize,freq.get(f));
            }
            else freq.put(f,1);
        }
        System.out.println("Maximum component size: "+maxSize);
    }

    // fetch parent for n and m - constant time complexity
    public static void union(int n, int m, Map<Integer,Integer> p) {
        int findN = find(n,p);
        int findM = find(m,p);
        if (findN < findM) p.put(findM,findN);
        else p.put(findN,findM);
    }

    // find parent for i - constant time complexity
    public static int find(Integer i, Map<Integer,Integer> parent) {
        if (parent.get(i) == null) parent.put(i,i);
        
        // move towards root of element
        while (i != parent.get(i)) i = parent.get(i);
        return i;
    }


}
