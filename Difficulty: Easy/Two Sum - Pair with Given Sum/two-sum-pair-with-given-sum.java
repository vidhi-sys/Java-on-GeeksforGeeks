class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int diff=target-arr[i];
            if(set.contains(diff)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}