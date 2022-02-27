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
    public void Deleteatpos(int pos)
    {
        if(head==null)
        {
            System.out.println("Error!!!");
            return;
        }
        if(pos==1)
        {
            ListNode curr=head;
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=head.next;
            head=head.next;
            return;
        }
        ListNode curr=head;
        while(pos!=2)
        {
            pos--;
            curr=curr.next;
        }
        curr.next=curr.next.next;
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
        ListNode n1=new ListNode(data);
        if(head==null&&pos==1)
        {
            head=n1;
            head.next=head;
            return;
        }
        if(pos==1)
        {
            n1.next=head;
            head=n1;
            return;
        }
        ListNode curr=head;
        while(pos!=2)
        {
            pos--;
            curr=curr.next;
        }
        n1.next=curr.next;
        curr.next=n1;

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
//        System.out.println("____________");
//        int data=sc.nextInt();
//        System.out.println("__________________________");
//        obj.InsertatAanyPos(2, data);
//        System.out.println("__________");
        obj.Deleteatpos(sc.nextInt());
        obj.display();
    }
}
