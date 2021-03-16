public class mergeArr {
    
    public static void main(String[] args) {
        
        int arr1[] = new int[]{1, 3, 5, 7};
        int arr2[] = new int[]{0, 2, 6, 8, 9};
        int n=4, m=5;

        int i=0,j=0;
        while(i<n && j<m){
            //System.out.println("j: "+j);
            if(arr1[i]<arr2[j]){
                
                i++;
                
            }
            else if(arr1[i]>arr2[j]){
                
                int el = arr1[i]; // find index in arr2
                arr1[i] = arr2[j];
                arr2[j] = el;
                i++;
                int index = bin(arr2,el,j+1,m-1);
                if(arr2[index] > el) arr2[j] = el;
                else{
                    int temp = arr2[index];
                    arr2[index] = el;
                    arr2[j] = temp;
                }
            }
            else i++;
        }

    }

     
    public static int bin(int arr[], int k, int start, int end){
        
        
        while(start<end){
            int mid = (start+end)/2;
            
            if(k<arr[mid]) end=mid;
            else if(k>arr[mid]) start = mid+1;
            else break;
        }
        if(arr[start] > k) start--;
        return start;
    }
}
