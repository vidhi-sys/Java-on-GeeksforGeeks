// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int max_sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }
        int sum=max_sum;
        for(int j=k;j<n;j++){
            sum+=arr[j]-arr[j-k];
            max_sum=Math.max(max_sum,sum);
            
        }
        return max_sum;
        
    }
}