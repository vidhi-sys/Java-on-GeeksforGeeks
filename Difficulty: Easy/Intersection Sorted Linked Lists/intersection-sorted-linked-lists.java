/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node temp1=head1;
        Node temp2=head2;
        Node a= new Node(0);
        Node ptr=a;
        HashSet<Integer>set=new HashSet<>();
        while(temp1!=null){
            
            set.add(temp1.data);
            temp1=temp1.next;
           
        }
        while(temp2!=null){
            if(set.contains(temp2.data)){
               ptr.next= new Node(temp2.data);
                ptr=ptr.next;
                
            }
           //set.add(temp2.data);
            temp2=temp2.next;
           
        }
        return a.next;
    }
}