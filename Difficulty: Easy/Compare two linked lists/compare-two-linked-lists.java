class Solution {
    int compare(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        String s1="";
        String s2="";
        
        while (temp1 != null) {
            
            s1+=Character.toString(temp1.data);
           
            temp1 = temp1.next;
            
        }
        while (temp2 != null) {
            
            
            s2+=Character.toString(temp2.data);
            
            temp2 = temp2.next;
        }
        
        
        if(s1.compareTo(s2)>0){
            return 1;
        }
        else if(s1.compareTo(s2)<0){
            return -1;
        }
        else if(s1.length()>s2.length()){
            return 1;
        }
        else  if(s2.length()>s1.length()){
            return -1;
        }
        else if(s1.length()==s2.length()){
            return 0;
        }
        return 1;
    }
}