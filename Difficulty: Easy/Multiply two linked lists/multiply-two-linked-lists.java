/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        StringBuffer num1=new StringBuffer("");
        StringBuffer num2=new StringBuffer("");
         long mod = 1000000007;
        Node temp1=first;
        Node temp2=second;
        while(temp1!=null){
          num1=num1.append(temp1.data);
            temp1=temp1.next;
            
            
        }
        while(temp2!=null){
          num2=num2.append(temp2.data);
            temp2=temp2.next;
            
        }
         long n1 = Long.parseLong(num1.toString());
        long n2 = Long.parseLong(num2.toString());
        return( n1*n2)%mod;
    }
}