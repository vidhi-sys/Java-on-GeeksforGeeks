// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        
        s=s.toLowerCase();
       
        HashSet<Character> set=new HashSet<>();
        
        for(char c:s.toCharArray()){
            if(set.contains(c)){
    
                return String.valueOf(c);
            }
              
            set.add(c);
            
            }
            return"-1";
    }
}