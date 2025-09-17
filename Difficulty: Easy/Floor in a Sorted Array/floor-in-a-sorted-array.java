class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int i=0;
        int j=arr.length-1;
        int floor=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>x){
                  
                   j=mid-1;
               
            }
            else{
                floor=mid;
                 i=mid+1;
              
            }
        }
        return floor;
    }
}
