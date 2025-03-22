//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    int missingNumber(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        // Handle edge case where the missing number is at the beginning
        if (arr[0] != 1) {
            return 1;
        }
        // Find the missing number
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
        }
        // Handle edge case where the missing number is at the end
        return arr[n - 1] + 1;
    }
}