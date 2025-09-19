class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int i=0;
        int j=m*n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mat[mid/m][mid%m]>x){
                j=mid-1;
            }
            else if(mat[mid/m][mid%m]<x){
                i=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
