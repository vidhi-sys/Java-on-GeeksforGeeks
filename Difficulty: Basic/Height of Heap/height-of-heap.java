class Solution {
   static int heapHeight(int n, int arr[]) {
    if(n == 0) return 0;
    if(n==1) return 1;
    return (int)(Math.log(n) / Math.log(2));
}
}