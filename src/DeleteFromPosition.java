import java.util.Scanner;

public class DeleteFromPosition
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
    public void PosDelete(int pos)
    {
        ListNode currNode=head,fast=head,slow=head;
        for(int i=1;i<=pos;i++)
        {
            if(i==pos-1)
            {
                slow=currNode;
            }
            if(i==pos)
            {
                fast=currNode.next;
            }
            currNode=currNode.next;
        }
        slow.next=fast;
        currNode=head;
        while(currNode!=null)
        {
            System.out.println(currNode.data+" ");
            currNode=currNode.next;
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
        DeleteFromPosition list = new DeleteFromPosition();
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        head=null;
        for(int i=0;i< s;i++)
        {
            list.addFirst(sc.nextInt());
        }
        list.PosDelete(sc.nextInt());
    }
}
