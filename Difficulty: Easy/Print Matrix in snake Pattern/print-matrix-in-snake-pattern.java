// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> snake=new ArrayList<Integer>();
        int n=matrix[0].length;
        int m=matrix.length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    snake.add(matrix[i][j]);
                }
            }
            else{
                for( int k=n-1;k>=0;k--){
                    snake.add(matrix[i][k]);
                }
            }
            
        }
        return(snake);
        
    }
}