// User function Template for Java

class Solution {
    static long isPallindrome(long N) {
        // code here
        String binary_str=Long.toBinaryString(N);
        StringBuilder sb=new StringBuilder(binary_str);
        String Reversed=sb.reverse().toString();
        if(Reversed.equals(binary_str)){
            return 1;
        }
        return 0;
    }
}