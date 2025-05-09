//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().sumOfDigits(n)); // computing sum of digits of n
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // complete the function
    public static int sumOfDigits(int n) {
       int sum=0;
       if(n<=9){
           return n;
           
       }
       else{
       String s=Integer.toString(n);
       for(int i=0;i<s.length();i++){
           sum+=Character.getNumericValue(s.charAt(i));
           
       }}
       return sum;
    }
}
