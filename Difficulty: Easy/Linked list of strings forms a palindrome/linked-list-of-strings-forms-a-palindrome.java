class Solution {
    public boolean compute(Node root) {
        Node temp=root;
        StringBuffer sb=new StringBuffer("");
        
        while(temp!=null){
            sb.append(temp.data);
            
            
            temp=temp.next;
        }
        String s = sb.toString();
        int left=0;
        int right=s.length()-1;
    
        while(left<right){
            if(s.length()==1){
                return true;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}