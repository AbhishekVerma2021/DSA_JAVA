import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NodeDeletion
{
    static ListNode head;
    static class ListNode
    {
        int data;
        ListNode next=null;
        ListNode(int data)
        {
            this.data=data;
        }
    }
    public void FirstDelete()
    {
        if(head==null)
        {
            return;
        }
        ListNode currNode;
        head=head.next;
        currNode=head;
        for(ListNode temp=currNode;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data+" ");
        }
    }
    public void addFirst(int data)
    {
        ListNode new1=new ListNode(data);
        if (head == null)
        {
            head=new1;
            return;
        }
        ListNode currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=new1;
        //System.out.println("Sucessfully added!!!");
    }
    public static void main(String[] args)
    {
        NodeDeletion list = new NodeDeletion();
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        head=null;
        for(int i=0;i< s;i++)
        {
            list.addFirst(sc.nextInt());
        }
        list.FirstDelete();
    }
}