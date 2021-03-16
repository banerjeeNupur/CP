// import java.util.Queue;

// import javax.management.Query;

// public class LinkedList {

//     public class Node{

//         int data;
//         Node next;

//         Node(){}
//         Node(int data){
//             this.data = data;
//             next = null;
//         }
//     }

//     Node head = null;

//     //insert to the beginning of the list
//     public void insertBeg(int data){

//         Node ptr = new Node(data);
//         if(head == null) head = ptr;
         
//         else{
//             ptr.next = head;
//             head = ptr;
//         }
//     }

//     // insert at end
//     public void insertEnd(int data){

//         Node ptr = new Node(data);

//         if(head == null) head = ptr;
//         else{
//             Node tail = new Node();
//             tail = head;
//             while(tail.next!=null){
//                 tail = tail.next;
//             }
//             tail.next = ptr;

//         }
//     }

//     // traverse the linked list
//     public void traverse(){
//         Node ptr = head;
//         while(ptr!=null){
//             System.out.print(ptr.data+"  ");
//             ptr = ptr.next;
//         }
//         System.out.println();
//     }

//     // merge 2 sorted lists
//     // 2 4 5 6 ---- 1 2 3 4
//     // 1 2 5 ----- 2 3 4
//     public void mergeSortedLists(Node h2){

//         Node curr1 = head, prev1 = null, curr2 = h2; 

//         while(curr1!=null && curr2!=null){
       
//             if(curr1.data<=curr2.data){
//                 prev1 = curr1;
//                 curr1 = curr1.next;
//             }
//             else{
//                 Node temp = new Node(curr2.data);
//                 if(prev1 == null){
//                     prev1 = temp;
//                     prev1.next = head;
//                     head = prev1;

//                 }
//                 else{
//                     prev1.next = temp;
//                     prev1 = temp;
//                     prev1.next = curr1;
//                 }
                
//                 curr2 = curr2.next;
//             }
//         }

//         if(curr2 != null)   curr1.next = curr2;
            
        

        
       

//     }


//     // add 2 numbers as list
//     public  Node add(Node h1, Node h2 ){
//         int carry = 0;
//         Node p1 = h1, p2 = h2;
//         Node ans = null, tail = ans;
//         while(p1 != null && p2!= null){
//             int sum = p1.data + p2.data + carry ;
//             carry = 0;
//             if(sum > 9){
//                 carry = 1;
//                 sum = sum%10;
//             }
//             Node tmp = new Node(sum);
//             if(ans == null){
//                 ans = tmp;
//                 tail = ans;
//             } else{
//                 tail.next = tmp;
//                 tail = tail.next;
//             }
//             p1 = p1.next;
//             p2 = p2.next;    
//         }

//         while(p1!=null){
//             int sum = p1.data + carry;
//             carry = 0;
//             if(sum > 9){
//                 carry = 1;
//                 sum = sum%10;
//             }
//             Node tmp = new Node(sum);
//             tail.next = tmp;
//             tail = tail.next;
//             p1 = p1.next;
//         }
        
        
//         while(p2!=null){
//             int sum = p2.data + carry;
//             carry = 0;
//             if(sum > 9){
//                 carry = 1;
//                 sum = sum%10;
//             }
//             Node tmp = new Node(sum);
//             tail.next = tmp;
//             tail = tail.next;
//             p2 = p2.next;

//         }

//         if(carry!=0){
//             Node tmp = new Node(carry);
//             tail.next = tmp;
//             tail = tail.next;
//         }

//         return ans;



//     }


//     // reverse a linked list

//     public void reverse(Node ptr){

//         if(ptr.next == null){
//             head = ptr;
//         }
//         else{
            
//             reverse(ptr.next);
//             Node tmp = ptr.next;
//             tmp.next = ptr;
//             ptr.next = null;

//         }
//     }

//     public static Node rotateRight(Node head, int k) {
        
//         Node p = head;
//         int i =0,len=0;
        
//         while(p!=null){
//             len++;
//             p = p.next;
//         }

//         System.out.println(len);
        
//         p=head;
//         k = k%len;
//         if(k == 0) return head;
        
//         while(i<k-len-1){
//             p = p.next;
//             i++;
//         }
        
//         Node ptr = p.next;
//         Node temp = p.next;
        
//         while(ptr.next!=null){
//             ptr = ptr.next;
//         }
        
//         ptr.next = head;
//         p.next = null;
//         head = temp;
        
//         return head;
        
        
//     }

//     public int get(int index){

//         Node temp = head;
//         int i = 0;
//         // 1 2 3 4 5 - get(3) = 4

//         while(temp!=null && i<index){
//             i++;
//             temp = temp.next;
//         }

//         if(temp == null) return -1;
//         else return temp.data;
//     }

   
//     public static void main(String[] args) {
        
//         LinkedList l1 = new LinkedList();
       
//         // l1.insertEnd(1); l1.insertEnd(9); l1.insertEnd(9);
//         // l2.insertEnd(9); l2.insertEnd(9); l2.insertEnd(9); l2.insertEnd(9); 
//         // l1.traverse();
//         //l2.traverse();
        
//         //l1.mergeSortedLists(l2.head);
//         //l1.traverse();

//         // LinkedList ans = new LinkedList(); 
//         // Node res = l1.add(l1.head, l2.head);

//         // ans.head = res;
//         // ans.traverse();

//         // l1.reverse(l1.head);
//         // l1.traverse();    
        
//         l1.insertEnd(1); l1.insertEnd(2); l1.insertEnd(3); l1.insertEnd(4); l1.insertEnd(5);
//         //LinkedList r = new LinkedList();
//         //r.head = rotateRight(l1.head,2);

//         //r.traverse();
//         l1.traverse();
//         System.out.println(l1.get(7));
        
        
//     }
// }

