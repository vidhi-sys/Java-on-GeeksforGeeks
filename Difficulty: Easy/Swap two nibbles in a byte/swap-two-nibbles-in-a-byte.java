// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        int a=n%16;
        int b=n/16;
        int ans=a*16+b;
        return ans;
    }
}