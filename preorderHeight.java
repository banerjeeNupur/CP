import java.io.*;

public class preorderHeight {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Preorder traversal: ");
        String s = br.readLine().trim(); // take binary string as the input

        int ans = height(s,0);
        System.out.println("Height: "+ans);
    }

    // 1110000: 1 - internal  0 - leaf
    public static int height(String s, int index){

        if(s.charAt(index) == '0') return 0; // leaf node, return 0

        index++;
        int left = height(s, index);

        index++;
        int right = height(s, index);

        return 1 + Math.max(left,right); // 1 + max of left/right subtree
    }
}
