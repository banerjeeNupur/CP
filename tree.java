public class tree {
    
    Node root;
    static class Node{
        int data;
        Node left=null, right=null;

        Node(){}
        Node(int d){
            data = d;
        }
    }

    // return LCA for the nodes a and b
    public static Node lca(Node ptr, int a, int b){

        if(ptr == null) return null;
        if(ptr.data > a && ptr.data > b) 
            return lca(ptr.left, a, b);
        if (ptr.data < a && ptr.data < b)  
            return lca(ptr.right, a, b);
        return ptr; 
    }

// search for the num in the bst starting from lca and store the minimum and maximum elements encountered on the way.
public static int[] traverse(Node ptr, int num , int num2){
        
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(ptr.data!=num){
            if(ptr.data!=num2) min = Math.min(min,ptr.data);
            if(ptr.data!=num2) max = Math.max(max,ptr.data);
            if(ptr.data < num) ptr = ptr.right;
            else ptr = ptr.left;
        }
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        
        tree t = new tree();
        t.root = new Node(52);
        t.root.left = new Node(26);
        t.root.right = new Node(73);
        t.root.left.right = new Node(32);
        t.root.left.right.left = new Node(29);
        t.root.left.right.right = new Node(39);
        t.root.right.left = new Node(64);
        t.root.right.right = new Node(93);
        t.root.right.right.left = new Node(85);
        

        int a = 29, b=64;
        Node l = lca(t.root,a,b); // get the lca of a and b

        int min[] = traverse(l,a,b); // search min
        int max[] = traverse(l,b,a); // search max

        int path_smallest = Math.min(min[0],max[0]);
        int path_largest = Math.max(min[1],max[1]);
        System.out.println("Finding for path between 29 and 64");
        if(path_smallest == Integer.MAX_VALUE && path_largest == Integer.MIN_VALUE) System.out.println("The path doesn't have any node other than the input");
        else System.out.println("Smallest element: "+path_smallest+"   Largest element:"+path_largest);

        System.out.println("\nFinding for path between 52 and 85");
        a = 52; b = 85;
        l = lca(t.root,a,b);
        min = traverse(l,a,b);
        max = traverse(l,b,a);
        path_smallest = Math.min(min[0],max[0]);
        path_largest = Math.max(min[1],max[1]);
        if(path_smallest == Integer.MAX_VALUE && path_largest == Integer.MIN_VALUE) System.out.println("The path doesn't have any node other than the input");
        else System.out.println("Smallest element: "+path_smallest+"   Largest element:"+path_largest);


    }
}
