import java.io.IOException;
import java.io.*;

// postorder from preorder and inorder
public class PostOrder {

     public static void main(String[] args) throws IOException {
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter inorder sequence: ");
            String in[] = br.readLine().trim().split(" ");
            System.out.println("Enter preorder sequence: ");
            String pre[] = br.readLine().trim().split(" ");
            int preorder [] = new int[pre.length];
            int inorder [] = new int[in.length];
            for (int i = 0; i < pre.length; i++) {
                preorder[i] = Integer.parseInt(pre[i]);
                inorder[i] = Integer.parseInt(in[i]);                
            }

            


     }
}
