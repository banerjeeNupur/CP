public class countAndSay {
    
    public static void main(String[] args) {
        
        int n = 5;
        
        if(n == 1) System.out.println("1"); // return "1";
        String[] arr = new String[2];

        arr[0] = "1";

        for(int i = 2;i<=n;i++){
            String s = arr[0];
            int j = 0, count=0;
            char c=0;
            StringBuilder str = new StringBuilder();
            while(j<s.length()){
                count = 0;
                c = s.charAt(j);
                while(j<s.length() && s.charAt(j) == c){
                    count++;
                    j++;
                }
                str.append(Integer.toString(count));
                str.append(Character.toString(c));

                
            }

            arr[0] = str.toString();
        }

        System.out.println(arr[0]);
    }
}