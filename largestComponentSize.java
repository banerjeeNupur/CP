import java.io.*;
import java.util.*;

// Complexity: O(n)*O(sqrt(n))
public class largestComponentSize {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers: ");
        String s[] = br.readLine().trim().split("\\s+");
        int num[] = new int[s.length];
        for(int i=0;i<s.length;i++) num[i] = Integer.parseInt(s[i]);

        System.out.println(calc(num));
    }

    public static int calc(int nums[]){

        // will store num vs root of the num
        Map<Integer,Integer> map = new HashMap<>(); 
        int max = 1;
        
        // complexity - O(n)*O(sqrt(n))
        for (int num : nums)
            for (int fact = 2; fact*fact<=num; fact++)
                if (num % fact == 0){
                    unionOp(num,fact,map);
                    unionOp(num,num/fact,map);
                }

        // root of union set vs its size
        Map<Integer,Integer> freq = new HashMap<>();
        for (Integer a : nums) {
            int root = findRoot(a,map);
            if (freq.containsKey(root)) {
                freq.put(root, freq.get(root)+1);
                max=Math.max(max,freq.get(root));
            }
            else freq.put(root,1);
        }
        return max;
    }

    // complexity - constant
    public static void unionOp(int n, int m, Map<Integer,Integer> map) {
        int N = findRoot(n,map);
        int M = findRoot(m,map);
        // store minimum of N and M as the root (n%m==0)
        if (N < M) map.put(M,N);
        else map.put(N,M);
    }

    // complexity - constant
    public static int findRoot(Integer i, Map<Integer,Integer> map) {
        if (map.get(i) == null) map.put(i,i);

        // move towards root of the union set
        while (i != map.get(i)) i = map.get(i); 
        return i;
    }
}
