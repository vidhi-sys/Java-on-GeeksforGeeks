//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine());
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().getDigitDiff1AndLessK(arr, k);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        
        ArrayList<Integer> l= new ArrayList<>();
        for(int i:arr){
            if(i<k&& diff(i)){
                    l.add(i);
            }
            }
            return l;
            
        }
        private boolean diff(int num){
            String s=Integer.toString(num);
            for(int i=0;i<s.length()-1;i++){
                int d1=s.charAt(i)-'0';
                int d2=s.charAt(i+1)-'0';
                if(Math.abs(d1-d2)!=1){
                    return false;
                }
            }
            return s.length()>1;
        }
        
    
}
