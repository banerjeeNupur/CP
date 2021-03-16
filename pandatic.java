import java.util.*;

public class pandatic {
    
    public static void main(String[] args) {
        
        int num = 13;
        int b[] = new int[1000001];
        for(int i=0;i<11;i++){
            if(i == 0 || i == 1 || i == 4) b[i] = 1;
            else b[i] = -1;
        }

        func(num,b);
        System.out.println(b[num]);
    }

    public static int func(int num, int b[]){

        if(num<0) return -1;
        if(b[num] == 1) return 1;
        if(b[num] == -1) return -1;

        int temp = num;
        while(temp>0){
            if(b[num] == 1) break;
            int res = temp%10;
            if(res==0) {
                temp = temp/10;
                continue;
            }
            b[num] = func(num-res*res,b);
            if(b[num]==1) break;
            temp = temp/10;
            }

            return 0;
        }
    }

