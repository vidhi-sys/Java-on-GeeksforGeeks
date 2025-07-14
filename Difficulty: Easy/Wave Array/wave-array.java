import java.util.Arrays;

class Solution {
    public void sortInWave(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}