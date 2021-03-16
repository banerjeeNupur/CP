public class BalancedParanthesis {
 
    public static void main(String[] args) {
        
        String s = "([]{())}";

        int len = s.length(),i=0;
        StringBuilder lastOpened = new StringBuilder();

        while(i<len){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                lastOpened.append(c);
            }
            else{
                if(c == ')' && lastOpened.charAt(lastOpened.length()-1) != '(') break;
                if(c == '}' && lastOpened.charAt(lastOpened.length()-1) != '{') break;
                if(c == ']' && lastOpened.charAt(lastOpened.length()-1) != '[') break;

                if(c == ')') lastOpened.deleteCharAt(lastOpened.length()-1);
                else if(c == '}') lastOpened.deleteCharAt(lastOpened.length()-1);
                else if(c == ']') lastOpened.deleteCharAt(lastOpened.length()-1);
            }
            i++;
        }

        
        if(i == len && lastOpened.length() == 0) System.out.println("balanced");
        
        else System.out.println("not balanced at index "+ i);

    }
}