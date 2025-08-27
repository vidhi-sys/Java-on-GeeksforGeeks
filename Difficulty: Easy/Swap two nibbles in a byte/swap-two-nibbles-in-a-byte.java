// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
       
       int left=(n&0x0F)<<4;
       int right=(n&0xF0)>>4;
       return(left|right);
    }
}