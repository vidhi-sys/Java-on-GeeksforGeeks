// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new Pair<>(0, 0);
        }
        
        Arrays.sort(arr);
        return new Pair<>(arr[0], arr[arr.length - 1]);
    }
}