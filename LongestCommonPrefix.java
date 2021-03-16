import java.util.ArrayList;

import java.util.Collections;

public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        
        ArrayList<String> A = new ArrayList<>();
        // ["abcdefgh", "aefghijk", "abcefgh"]
        A.add("abab"); A.add("ab"); A.add("abcd");

        String a = longestCommonPrefix(A);

        System.out.println(a);

    }

    public static String longestCommonPrefix(ArrayList<String> A) {

        Collections.sort(A);

        String first = A.get(0);
        String last = A.get(A.size()-1);
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<first.length()){
            if(first.charAt(i) == last.charAt(i)) str.append(first.charAt(i));
            else break;
            i++;
        }

        return str.toString();
    }
}