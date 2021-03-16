import java.util.*;

public class climbingStairs {
    
    static HashMap<Integer,Integer> map = new HashMap<>();
    
    
    static int count(int dest){

        int total = 0;
        if(dest == 0 || dest == 1) return 1; 
        if(map.containsKey(dest)) return map.get(dest);
        for (int i = 1; i <=dest; i = i+2) {
            if(dest-i >= 0){
                total += count(dest-i);
            }
        }       
        map.put(dest, total);
        return total;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            
            int n = sc.nextInt();
            System.out.println(count(n));
        }
        sc.close();
    }
}