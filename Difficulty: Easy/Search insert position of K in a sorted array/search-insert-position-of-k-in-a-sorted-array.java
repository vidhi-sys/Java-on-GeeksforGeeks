class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
         int i = 0;
        int j = arr.length - 1;
        
        while (i <= j) {
            int mid = i + (j - i) / 2;
            
            if (arr[mid] == k) {
                return mid;
            }
            
            if (k > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        
        return i;
        
    }
};