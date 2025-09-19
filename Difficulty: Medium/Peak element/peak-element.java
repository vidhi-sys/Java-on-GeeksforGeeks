class Solution {
    public int peakElement(int[] arr) {
        // code here
          int i=0;
        int j=arr.length-1;
        int peak_idx=0;

        while(i<j){
           
            int mid=i+(j-i)/2;
           
            
             if(arr[mid]>arr[mid+1]){
            
                 j=mid;
           



            }
            else {
               
                 i=mid+1;


            }
          
        }
        return i;
        
    }
}
