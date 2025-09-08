class Solution {
    public int[] findStartingPoint(int x, int y, int[][] pathCoordinates) {
 int totalDX = 0;
        int totalDY = 0;
        
        // Sum all movements
        for (int[] move : pathCoordinates) {
            totalDX += move[0];
            totalDY += move[1];
        }
        
        // Starting point = final point - total movement
        return new int[]{x - totalDX, y - totalDY};
        
        
    }
}