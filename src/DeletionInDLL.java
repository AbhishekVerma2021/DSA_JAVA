import java.util.List;
import java.util.Scanner;

public class DeletionInDLL
{
    ListNode head,tail;
    static class ListNode
    {
        int data;
        ListNode next=null;
        ListNode prev=null;
        ListNode(int data)
        {
            this.data=data;
        }
    }
    public void display()
    {
        ListNode currNode = head;
        System.out.println("Forward direction!!!");
        while(currNode!=null)
        {
            System.out.print(currNode.data + " ");
            currNode=currNode.next;
        }
        ListNode prevNode= tail;
        System.out.println("Backward direction!!!");
        while(prevNode!=null)
        {
            System.out.print(prevNode.data + " ");
            prevNode=prevNode.prev;
        }

    }

    public void insertele(int data)
    {
        ListNode new1=new ListNode(data);
        if(head==null)
        {
            head=new1;
            head.next=null;
            return;
        }
        ListNode currNode=head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=new1;
        new1.prev=currNode;
        tail=new1;
    }
    public void DeleteFromPosition(int pos)
    {
        if(head==null)
        {
            head=null;
            return;
        }
        if(head.next==null&&pos==1)
        {
            head=head.next;
            return;
        }

            ListNode currNode=head;
            while(pos>2)
            {
                currNode=currNode.next;
                pos--;
            }
        if(currNode.next.next!=null)
        {
            currNode.next.next.prev = currNode;
            currNode.next = currNode.next.next;
        }
        else
        {
            currNode.next=null;
            tail=currNode;
        }

    }
    public static void main(String[] args) {
        DeletionInDLL list=new DeletionInDLL();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            list.insertele(sc.nextInt());
        }
        list.DeleteFromPosition(sc.nextInt());
        list.display();
    }
}
