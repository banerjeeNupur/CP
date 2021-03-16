public class par {
    
    static int in=0;
    public static void main(String[] args) {
        
        String  s = "([]{()})";

        check(s);

    }

    public static void check(String s){

        // ([]{()})
        int top = 0, i=0, count=0;
        
        while(i<s.length()){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') top = i;
            else if(s.charAt(i) == ')'){
                if(s.charAt(top) == '('){
                    count += 2;
                    top--;
                    while(top>0 && s.charAt(top) != '(' || s.charAt(top) != '{' || s.charAt(top) != '[' ) top--;
                }
                else break;
            }
            else if(s.charAt(i) == '}'){
                if(s.charAt(top) == '{'){
                    count += 2;
                    top--;
                    while(top>0 && s.charAt(top) != '(' || s.charAt(top) != '{' || s.charAt(top) != '[' ) top--;
                }
                else break;
            }
            else if(s.charAt(i) == ']'){
                if(s.charAt(top) == '['){
                    count += 2;
                    top--;
                    while(top>0 && s.charAt(top) != '(' || s.charAt(top) != '{' || s.charAt(top) != '[') top--;
                }
                else break;
            }

            i++;
        }

        if(count!=s.length()) System.out.println("not balanced");
        else System.out.println("balanced");
    }
}
