class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders= new ArrayList<>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
       for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                leaders.add(arr[i]);
            }
            
        }
        Collections.reverse(leaders);
        return leaders;
        
    }
}
