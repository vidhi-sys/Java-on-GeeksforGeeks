// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
         ArrayList<Integer>list=new  ArrayList<>();
         Node temp=head;
         while(temp!=null){
             list.add(temp.data);
             temp=temp.next;
         }
         return list;
    }
}