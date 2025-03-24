//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends

class Solution {
    static String revStr(String s) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        // Swap characters from start and end until they meet in the middle
        while (start < end) {
            // Swap charArray[start] and charArray[end]
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}