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
       if(head==null||head.next==null)
       {
            head=null;
            return;
        }
       if(pos==1)
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
       currNode.next=currNode.next.next;
    }

    public void display()
    {
        if(head==null)
        {
            return;
        }
        ListNode currNode=head;
        while(currNode!=null)
        {
            System.out.println(currNode.data+ " ");
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
        list.display();
    }
}
