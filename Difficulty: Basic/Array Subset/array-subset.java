import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (freq.getOrDefault(num, 0) == 0) {
                return false;
            }
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    }
}