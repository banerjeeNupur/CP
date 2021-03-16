public class rainwater {
    
    public static void main(String[] args) {
        
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int total=0, temp=0;
        lmax[0] = height[0];
        rmax[height.length-1] = height[height.length-1];

        for(int i=1;i<height.length;i++)            
            if(lmax[i-1] > height[i]) lmax[i] = lmax[i-1]; 
            else lmax[i] = height[i];
            
        
        for(int i=height.length-2;i>=0;i--)            
            if(rmax[i+1] > height[i]) rmax[i] = rmax[i+1]; 
            else rmax[i] = height[i];

        for (int i : lmax) {
            System.out.print(i+"  ");   
        }
        System.out.println();
        for (int i : rmax) {
            System.out.print(i+"  ");   
        }
        System.out.println();

        for (int i : height) {
            System.out.print(i+"  ");   
        }
        System.out.println();

        for (int i = 1; i < height.length-1; i++) {
            
            temp = Math.min(lmax[i],rmax[i]);
            total += (temp-height[i] > 0 ? temp-height[i] : 0);
        }
        
        System.out.println(total);
    }
}
