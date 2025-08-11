// User function Template for Java

class Solution {
    static int rotationCount(long R, long D) {
        // code here
        long  count=0; 
        long first=0;
        long second=0;
        
        while(R!=0){
            first=R%10;
            second=D%10;
            R/=10;
            D/=10;
            count+=Math.min(Math.abs(first-second),10-Math.abs(first-second));
        }
        return (int)count;
    }
    
}