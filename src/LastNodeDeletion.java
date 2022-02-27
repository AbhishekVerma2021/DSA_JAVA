import java.util.Scanner;

public class LastNodeDeletion
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
    public void LastDelete()
    {
        if(head==null)
        {
            return;
        }
        ListNode currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=null;
        currNode=head;
        while (currNode!=null)
        {
            System.out.print(currNode.data+ " ");
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
        new1.next=null;
        //System.out.println("Sucessfully added!!!");
    }
    public static void main(String[] args)
    {
        LastNodeDeletion list = new LastNodeDeletion();
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        head=null;
        for(int i=0;i< s;i++)
        {
            list.addFirst(sc.nextInt());

        }
        list.LastDelete();
    }
}
