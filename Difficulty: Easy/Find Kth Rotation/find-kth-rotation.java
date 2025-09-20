class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int rotate=0;
       int i=0;
       int r=arr.length-1;
       while(i<r){
           int mid=i+(r-i)/2;
           if(arr[mid]>arr[r]){
               i=mid+1;
               
           }
           else{
               r=mid;
               
           }
       }
       return r;
        
    }
}