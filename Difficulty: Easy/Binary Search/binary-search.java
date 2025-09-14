class Solution {
    public int binarysearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
                result = mid;    // Found a occurrence
                right = mid - 1; // Continue searching left for first occurrence
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}