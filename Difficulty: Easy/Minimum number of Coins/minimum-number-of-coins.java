import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Integer> minPartition(int N) {
        ArrayList<Integer> coins = new ArrayList<>();
        int[] arr = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1}; // Sorted in descending order
        
        for (int i = 0; i < arr.length; i++) {
            while (N >= arr[i]) {
                N -= arr[i];
                coins.add(arr[i]);
            }
        }
        
        return coins;
    }
}