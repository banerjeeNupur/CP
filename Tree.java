// import java.util.*;
// import java.util.LinkedList;


// public class Tree {
    
//      Node root = null;
//      Node temp = root; 

    
//     static class Node{

//         int data;
//         Node lptr = null, rptr = null;

//         Node(){}
//         Node(int data){
//             this.data = data;
//         }
//     }

//     public Node insert(Node temp, int data){

//         if(root == null){
//             root = new Node(data);
//             return root;
//         }

//         Queue<Node> q = new LinkedList<>();
//         q.add(temp);

//         while(!q.isEmpty()){
//             temp = q.peek();
//             q.remove();

//             if(temp.lptr == null){
//                 temp.lptr = new Node(data);
//                 break;
//             }
//             else q.add(temp.lptr);


//             if(temp.rptr == null){
//                 temp.rptr = new Node(data);
//                 break;
//             }
//             else q.add(temp.rptr);


//         }
//         return root;
//     }

//     public static void inorder (Node ptr){

//         if(ptr == null) return;
//         inorder(ptr.lptr);
//         System.out.print(ptr.data+" ");
//         inorder(ptr.rptr);

//     }

//     public static void preorder (Node ptr){

//         ArrayList<Integer> pre = new ArrayList<>();
//         Node temp = ptr;

        

//     }

//     // public void zigzag(Node head){

//     //     Node temp = head;
//     //     Queue<Node> queue = new LinkedList<>();
//     //     int i=0, iter=0;
//     //     List<List<Integer>> ans = new ArrayList<List<Integer>>();
//     //     queue.add(temp);
//     //     temp = queue.peek();
        
//     //     while(!queue.isEmpty()){

//     //         i = 0;
//     //         List<Integer> list = new ArrayList<>();
            
//     //         while(i<Math.pow(2,iter)){
                
//     //             if(temp != null){
//     //                 queue.add(temp.lptr);
//     //                 queue.add(temp.rptr);
//     //                 if(queue.peek().data != -1){
//     //                     list.add(queue.peek().data);
//     //                 }
//     //             queue.remove();
                
//     //             } 
                
//     //             temp = queue.peek();
//     //             i++;
//     //         }
//     //         ans.add(list);
//     //         iter++;
//     //     }

//     //     for (List<Integer> list : ans) {
//     //         System.out.println("in");
//     //         System.out.println(list);
//     //     }
//     // }
    
//     public static void main(String[] args) {
        
//         Tree head = new Tree();
//         head.insert(head.root, 3); 
//         head.insert(head.root, 9); 
//         head.insert(head.root, 20); 
//         head.insert(head.root, -1); 
//         head.insert(head.root, -1); 
//         head.insert(head.root, 15); 
//         head.insert(head.root, 7); 

//         //head.zigzag(head.root);
//         //inorder(head.root);
//         // preorder(head.root);    

//     }
// }
