class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
         ArrayList<Integer> minMaxCandy= new ArrayList<>();
         Arrays.sort(prices);
        int buy=0;
        int sell=0;
       int i=0;
       int j=prices.length-1;
       while(i<=j){
           buy+=prices[i];
           
           i++;
           j-=k;
       }
       i=prices.length-1;
       j=0;
       while(i>=j){
            sell+=prices[i];
           i--;
           j+=k;
          
       }
        minMaxCandy.add(buy);
        minMaxCandy.add(sell);
        return minMaxCandy;
        
    }
}
