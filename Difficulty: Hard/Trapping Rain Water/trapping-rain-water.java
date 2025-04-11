//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        int n=arr.length;
        int left_max[]=new int[n];
        int right_max[]=new int[n];
        left_max[0]=arr[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(left_max[i-1],arr[i]);
            
        }
         right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],arr[i]);
        
        }
        int trap=0;
        for(int i=0;i<n;i++){
            trap+=Math.min(left_max[i],right_max[i])-arr[i];
        }
        return trap;
    }
}
