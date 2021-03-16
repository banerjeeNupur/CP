package HackeRank;

import java.util.HashMap;


public class arrayManipulation {
    
    public static void main(String[] args) {
        

    int[][] queries = new int[][]{{1,2,100},{2,5,100},{3,4,100}};
    
    HashMap<Integer,Long> map = new HashMap<>();
    int rows = queries.length;

    for (int i = 0; i < rows; i++) {
        int start = queries[i][0];
        int end = queries[i][1]+1;
        long val = queries[i][2];

        if(map.containsKey(start)){
            map.put(start,map.get(start)+val);
        }else{
            map.put(start,val);
        }

        val = -val;
        if(map.containsKey(end)){
            map.put(end,map.get(end)+val);
        }else{
            map.put(end,val);
        }
    }

    long max = 0, value = 0;

    for (int i = 0; i < 5; i++) {
        value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
        max = Math.max(max, value);
    }

    System.out.println(max);


    }

    
}