import java.util.Scanner;

public class CirculerLinkedList
{
    ListNode head;
    static class ListNode
    {
        int data;
        ListNode next;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    public void InsertAtLast(int data)
    {
        ListNode n1=new ListNode(data);
        if(head==null)
        {
            head=n1;
            head.next=head;
            return;
        }
        ListNode curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=n1;
        n1.next=head;
    }
    public void InsertatAanyPos(int pos,int data)
    {
        if
    }
    public void display()
    {
        ListNode curr=head;
        System.out.print(curr.data+ " ");
        while(curr.next!=head)
        {
            curr=curr.next;
            System.out.print(curr.data+ " ");

        }
    }
    public static void main(String[] args) {
        CirculerLinkedList obj=new CirculerLinkedList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            obj.InsertAtLast(sc.nextInt());
        }

        obj.display();
    }
}
