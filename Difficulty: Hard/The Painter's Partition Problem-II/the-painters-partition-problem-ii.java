import java.util.Arrays;

class Solution {
    boolean possible(int[] arr, int k, int mid) {
        int time = 0;
        int painter = 1; // Start with first painter
        
        for(int i = 0; i < arr.length; i++) {
            if(time + arr[i] > mid) {
                // Current board cannot be assigned to current painter
                painter++; // Need new painter
                time = arr[i]; // Start with current board for new painter
                
                // If we need more painters than available, return false
                if(painter > k) {
                    return false;
                }
            } else {
                // Assign current board to current painter
                time += arr[i];
            }
        }
        return true;
    }
    
    public int minTime(int[] arr, int k) {
        if(arr.length < k) {
            return -1;
        }
        
        int start = Arrays.stream(arr).max().getAsInt(); // Minimum possible time (largest board)
        int end = Arrays.stream(arr).sum(); // Maximum possible time (all boards to one painter)
        int ans = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(possible(arr, k, mid)) {
                ans = mid;
                end = mid - 1; // Try for smaller maximum time
            } else {
                start = mid + 1; // Need to increase maximum time
            }
        }
        return ans;
    }
}