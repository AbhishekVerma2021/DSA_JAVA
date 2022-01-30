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
       if(head==null)
       {
           return;
       }
       if(head.next==null && pos!=1)
       {
           return;
       }
       else if(pos==1)
       {
           head=null;
       }
       else
       {
            ListNode currNode = head, slow = head;
            while (pos != 1)
            {
                slow = currNode;
                currNode = currNode.next;
                pos--;//2//1
            }
            if (currNode.next == null)
            {
                slow.next = null;
            }
            else
            {
                slow.next = slow.next.next;
            }
        }
       ListNode currNode=head;
       while(currNode!=null)
       {
           System.out.println(currNode.data);
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
        for(int i=0;i<s;i++)
        {
            list.addFirst(sc.nextInt());
        }
        int pos=sc.nextInt();
        if(pos<=s)
        {
            list.PosDelete(pos);
        }
    }
}
