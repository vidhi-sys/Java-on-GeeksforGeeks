// User function Template for Java

class Solution {
    int sumOfRowCol(int N, int M, int A[][]) {
        int check=Math.min(M,N);
        for (int i = 0; i < check; i++) {
            int rowSum = 0;
            int colSum = 0;
            
            // Calculate i-th row sum
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }
            
            // Calculate i-th column sum
            for (int j = 0; j < N; j++) {
                colSum += A[j][i];
            }
            
            if (rowSum != colSum) {
                return 0;
            }
        }
        
        return 1;
    }
}