package HackeRank;

import java.util.*;

public class Triplets {
    
    public static void main(String[] args) {
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(17); a.add(28); a.add(80);
        b.add(20); b.add(26); b.add(10);

        int ca =0, cb=0;
        for (int i = 0; i < a.size(); i++) {
            int acurr = a.get(i);
            int bcurr = b.get(i);

            if(acurr>bcurr) ca++;
            else if (bcurr>acurr) cb++;
            
        }

        List<Integer> res = new ArrayList<>();
        res.add(ca);
        res.add(cb);

        
    }
}