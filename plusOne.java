import java.util.ArrayList;

public class plusOne {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<>();
        A.add(9); A.add(9); A.add(9);

        int len = A.size(), carry = 1;
        System.out.println(len);
        for(int i = len-1 ; i>=0; i--){
            int sum = A.get(i) + carry;
            carry = 0;
            if(sum > 9){
                A.set(i,sum%10);
                carry = sum/10;
              //  continue;
            }
            else
            //System.out.print(i+"  ");
            A.set(i,sum);
        }
        
        // 9 9 9 
        System.out.println("carry is "+ carry);
        if(carry!=0) A.set(0,carry);
        A.add(0, carry);
        
        for (Integer i : A) {
            System.out.println(i);
        }


    }
}