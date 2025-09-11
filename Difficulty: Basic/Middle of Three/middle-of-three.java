// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        int[]num=new int[3];
            num[0]=a;
            num[1]=b;
            num[2]=c;
       Arrays.sort(num);
       return num[1];
       
    }
}