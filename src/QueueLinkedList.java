import java.util.Scanner;

public class QueueLinkedList
{
    static int size;
    ListNode head,last,front;
    static class ListNode
    {
        ListNode next;
        int data;
        ListNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    QueueLinkedList(int size)
    {
        this.size=size;
    }
    public boolean isempty()
    {
        if(front==null)
        {
            return true;
        }
        return false;
    }
    public boolean isfull()
    {
        ListNode currNode=head;
        int f=0;
        while(currNode!=null)
        {
            currNode=currNode.next;
            f++;
        }
        if(f==size)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int data)
    {
        ListNode n1=new ListNode(data);
        if(isempty())
        {
            front=n1;
            front.next=null;
            last=front;
        }
        else if(isfull())
        {
            System.out.println("Overflow!!!");
            return;
        }
        else
        {
            last.next=n1;
            n1.next=null;
            last=n1;
        }
    }
    public void dequeue()
    {
        if(isempty())
        {
            System.out.println("Underflow!!!!");
            return;
        }
        else
        {
            front=front.next;
        }
    }
    public void display()
    {
        ListNode currrNode=front;
        while(currrNode!=last.next)
        {
            System.out.print(currrNode.data+ " ");
            currrNode=currrNode.next;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        QueueLinkedList obj=new QueueLinkedList(size);
        for(int i=0;i<size;i++)
        {
            System.out.print("Enqueue : ");
            obj.enqueue(sc.nextInt());
        }
        for (int i=0;i<2;i++)
        {
            System.out.println("Dequeue!! ");
            obj.dequeue();
        }
        obj.display();
    }
}
