public class Palindrome {
    
    public static void main(String[] args) {
        
        //String s = "A man, a plan, a canal: Panama";
        
        String s = "race a car";

        
        s = s.toLowerCase();


        int i=0, j=s.length()-1;

        while(i<=j){

            while(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) i++;
            while(!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))) j--;
        
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else break;
        }

        if(i<j) System.out.println("not a pal!");
        else System.out.println("pal!");
    }
}

