class Solution {
    public int findCeil(int[] arr, int x) {
         int lo = 0, hi = arr.length - 1, res = -1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < x)
                lo = mid + 1;      
            
            else { 
                res = mid;   
                hi = mid - 1;
            }}
        return res;
          
    
    }
}