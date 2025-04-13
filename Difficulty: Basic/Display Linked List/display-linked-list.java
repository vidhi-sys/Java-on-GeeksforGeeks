//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


class Driver
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            ArrayList<Integer> list = new Get().displayList (head);
            for(int i = 0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println ("");
        
System.out.println("~");
}
    }
    
}


// } Driver Code Ends


//User function Template for Java


/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}*/

class Get
{
    public static ArrayList<Integer> displayList(Node head)
    {
        ArrayList<Integer> Alist  = new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            Alist.add(temp.data);
            temp=temp.next;
        }   
       return  Alist;     
    }
}