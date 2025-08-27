class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int start=0;
      
        int max_ones=0;
        int zeros=0;
        for(int end=0;end<arr.length;end++){
             if(arr[end]==0){
                 zeros++;
             }
             while(zeros>k){
                 if(arr[start]==0){
                     zeros--;
                 }
                 start++;
             }
              max_ones=Math.max(max_ones,end-start+1);
            
        }
       
        return max_ones;
       
    }
}