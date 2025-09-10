class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
       
        for (int j = 0; j < m; j++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = mat[start][j];
                mat[start][j] = mat[end][j];
                mat[end][j] = temp;
                start++;
                end--;
            }
        }
    }
}