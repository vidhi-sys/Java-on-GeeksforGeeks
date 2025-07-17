// User function Template for Java

class Solution {
    
     
    public void immediateSmaller(int arr[]) {
     int n=arr.length;
       for(int i=0;i<=n-2;i++){
           if(arr[i]>arr[i+1]){
               int temp=arr[i];
               arr[i]=arr[i+1];
               temp=arr[i+1];
               
           }
           else{
               arr[i]=-1;
           }
           
       }
       arr[n-1]=-1;
       
        
    }
}