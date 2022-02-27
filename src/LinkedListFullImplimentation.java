import java.util.Scanner;

public class LinkedListFullImplimentation
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    public void InsertAtLAst(int data)
    {
        Node n1= new Node(data);
        if(isEmpty())
        {
            head=n1;
            head.next=null;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr= curr.next;
        }
        curr.next=n1;
        n1.next=null;
    }
    public void InsertionAtBeginning(int data)
    {
        Node n1= new Node(data);
        if(isEmpty())
        {
            head=n1;
            head.next=null;
            return;
        }
        n1.next=head;
        head=n1;
    }
    public void InsertAtAny(int pos,int data)
    {
        Node n1=new Node(data);
        if(isEmpty()&&pos==1)
        {
            head=n1;
            head.next=null;
            return;
        }
        Node curr=head;
        int f=0;
        while(curr!=null)
        {
            f++;
            curr=curr.next;
        }
        curr=head;
        while(f!=0)
        {
            f--;
            curr=curr.next;
        }
        n1.next=curr.next;
        curr.next=n1;
    }
    public void LastNodeDeletion()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to delete!!!!");
            return;
        }
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
    }
    public void FrontDeletion()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to delete!!!");
            return;
        }
        head=head.next;
    }
    public void AnyPosDeletion(int pos)
    {
        if(isEmpty())
        {
            System.out.println("Nothing to delete!!!");
            return;
        }
        Node curr=head;
        if(pos==1)
        {
            head=head.next;
            return;
        }
        while(pos!=2)
        {
            pos--;
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+ " ");
            curr=curr.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedListFullImplimentation obj = new LinkedListFullImplimentation();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            obj.InsertionAtBeginning(sc.nextInt());
        }
        obj.display();
        System.out.println("_____________________");
        obj.AnyPosDeletion(sc.nextInt());

        obj.display();
    }
}