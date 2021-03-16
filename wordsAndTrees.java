import java.util.*;
import java.io.*;

public class wordsAndTrees {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().trim().split("\\s+");
        int nodes = Integer.parseInt(s[0]); // number of nodes
        int questions = Integer.parseInt(s[1]); // number of questions

        String node_char[] = br.readLine().trim().split("\\s+"); // character at node : o v s l v p d i
        char ch[] = new char[node_char.length];
        for (int i = 0; i < ch.length; i++) ch[i] = node_char[i].charAt(0);

        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=1;i<nodes+1;i++) graph.put(i, new ArrayList<Integer>());
        
        // build graph 
        for(int i=0;i<nodes-1;i++){
            String edge[] = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < questions; i++) {
            String x[] = br.readLine().trim().split("\\s+");
            int root = Integer.parseInt(x[0]); // starting node for dfs
            String st = x[1]; // string to be formed
            boolean visited[] = new boolean[nodes+1];
            int c[] = new int[26];
            visited[1] = true;
            int index = ch[0] - 'a';
            c[index]++;
            DFS(graph, 1, st, ch, visited,c); // DFS to check the number of characters required
            
            int count=0;
            for (int j = 0; j < st.length(); j++) {
                int ind = st.charAt(j) -'a';
                if(c[ind] >0){
                    count++;
                    c[ind]--;
                }
            }


            System.out.println(st.length()-count);

        }
        
    }

    // st: string to be formed
    // node_char: character at node
    public static void DFS(HashMap<Integer,ArrayList<Integer>> graph, int root, String st, char [] ch, boolean[] visited,int [] c){

        // perform dfs starting from root
        
        ArrayList<Integer> path = graph.get(root);
        visited[root] = true;
        int index = ch[root-1] - 'a';
        c[index]++;
        for(int i:path){
            if(!visited[i]){
                //index = i-1;
                //int s = ch[index] - 'a';
                //c[s]++;
                DFS(graph, i, st, ch, visited,c);
            }
            
        }
        //int s = ch[root-1] - 'a';
        //c[s]++;
        // check string formed
    
        // check(c,st);

    }

    public static void check(int c[], String st){

        int count=st.length();
        for (int i = 0; i < st.length(); i++) {
            int index = st.charAt(i) - 'a';
            if(c[index]>0){
                c[index]--;
                count--;
            } 
            
        }

        
        System.out.println(count);
        //return count;
    }
}
