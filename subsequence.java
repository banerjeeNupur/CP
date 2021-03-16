import java.util.*;

public class subsequence {
    
    public static void main(String[] args) {
        
        String str = "cab";
        ArrayList<String> arr = new ArrayList<>();
        generate(str,arr,"",0);

        for (String string : arr) {
            System.out.println(string);
        }
    }

    public static void generate(String str, ArrayList<String> arr,String s, int index){

        if(index == str.length()) return;
        
        for(int i=index;i<str.length();i++){
            s += str.charAt(i);
            if(!s.isEmpty()) arr.add(s);
            generate(str, arr, s, i+1);
            s = s.substring(0,s.length()-1);
        }
    }
}
