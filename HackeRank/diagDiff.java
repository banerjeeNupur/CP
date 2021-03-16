package HackeRank;

import java.util.*;

public class diagDiff {
    
    public static void main(String[] args) {
        
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        num.add(11); num.add(2); num.add(4);
        arr.add(num);

        num = new ArrayList<>();
        num.add(4); num.add(5); num.add(6);
        arr.add(num);

        num = new ArrayList<>();
        num.add(10); num.add(8); num.add(-12);
        arr.add(num);

        int diff = diagonalDifference(arr);
        System.out.println(diff);

        
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
    
            int pri_diag = 0, sec_diag=0;
            List<Integer> temp = new ArrayList<>();
            
            for(int i =0;i<arr.size();i++){
                
                temp = arr.get(i);
                

                pri_diag = pri_diag + temp.get(i);
                System.out.println(temp.get(i) + "  -  "+ pri_diag);
            }
    
            
            for(int i =arr.size()-1;i>=0;i--){
                
                temp = arr.get(arr.size()-1-i);
                sec_diag = sec_diag + temp.get(i);
                
            }
    
            System.out.println(sec_diag+"  "+pri_diag);
            return Math.abs(pri_diag-sec_diag);
        }
    
}