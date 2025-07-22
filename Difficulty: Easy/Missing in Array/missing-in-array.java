class Solution {
    int missingNum(int arr[]) {
        int n=arr.length;
        int sum1=0;
        int sum2=0;
        
        for(int i=1;i<=n+1;i++){
            sum2+=i;
        }
        for(int j:arr){
            sum1+=j;
        }
        return (sum2-sum1);
        
        
    }
}