// User function Template for Java
class Solution {
    String sort(String s) {
        int n=s.length();
        char []ch=new char[n];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            ch[i]=s.charAt(i);
        }
        Arrays.sort(ch);
         for(int i=0;i<n;i++){
            ans.append(ch[i]);
        }
        return ans.toString();
        
        
    }
}