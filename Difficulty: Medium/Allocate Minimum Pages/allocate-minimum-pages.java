class Solution {
    public boolean ispossible(int[] arr, int k,int mid){
        int pagessum=0;
        int books=1;
        for(int i=0;i<arr.length;i++){
            if(pagessum+arr[i]>mid){
                pagessum=arr[i];
                books++;
            }
            else{
                pagessum+=arr[i];
                
            }
        }
        return (books<=k);
    }
    public int findPages(int[] arr, int k) {
         int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        int ans=-1;
        if(arr.length<k){
            return -1;
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ispossible(arr,k,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return ans;
 
    }
}