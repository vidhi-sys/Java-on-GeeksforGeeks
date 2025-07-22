// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        HashSet<Integer> duplicate=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(duplicate.contains(arr[i])){
                return true;
            }
            
         duplicate.add(arr[i]);   
        }
        
        return false;
        
    }
}