import java.io.*;

 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
 
 
class words {
 
    static Node adjList[];
    static boolean visited[];
    static String nodeString[];
    static String charList[];
 
    public static void DFS(int u){
        visited[u] = true;
        Node temp = adjList[u];
        while(temp!=null){
            if(!visited[temp.data]){                
                DFS(temp.data);    
                nodeString[u] = nodeString[u] + nodeString[temp.data];
            }
            temp = temp.next;
        }
        nodeString[u] = nodeString[u] + charList[u-1];   
           
    }
 
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str[] = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        adjList = new Node[n+1];
        
        charList = br.readLine().split("\\s+");
        for(int i=0;i<n-1;i++){
            String s[] = br.readLine().split("\\s+");
            int u_data = Integer.parseInt(s[0]);
            int v_data = Integer.parseInt(s[1]);
            Node u = new Node(u_data);
            Node v = new Node(v_data);
 
            v.next = adjList[u_data] ;
            adjList[u_data] = v;
 
            u.next = adjList[v_data] ;
            adjList[v_data] = u;
        }

        for (int i = 1; i < adjList.length; i++) {
            Node temp = adjList[i];
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        visited = new boolean[n+1];
        nodeString = new String[n+1];
        for(int k=0;k<=n;k++){
            nodeString[k] = "";
        }
        visited[1] = true;
        DFS(1);
        
        for (String string : nodeString) {
            System.out.println(string);
        }
        for(int i=0;i<m;i++){
 
            String s[] = br.readLine().split("\\s+");
            int v = Integer.parseInt(s[0]);
            String st = s[1];
            
            int ch[] = new int[26];
            for(int k=0;k<st.length();k++){
                ch[st.charAt(k)-'a']++;
            }

 
            String strVal = nodeString[v];
           
            for(int k=0;k<strVal.length();k++){
            
                if(ch[strVal.charAt(k)-'a'] > 0)
                    ch[strVal.charAt(k)-'a']--;
            }
      
            int cnt = 0;
            for(int k=0;k<26;k++){
                cnt+=ch[k];
            }
                 
            System.out.println(cnt);
        }
 
    }
}