// User function Template for Java

class Solution {
    static int assignMiceHoles(int N, int[] M, int[] H) {
        int diff=0;
        Arrays.sort(M);
        Arrays.sort(H);
        for(int i=0;i<N;i++){
            if(diff<Math.abs(M[i]-H[i])){
                diff=Math.abs(M[i]-H[i]);
            }
            
        }
        return Math.abs(diff);
    }
};