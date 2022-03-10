import java.util.Scanner;

class QueueWithLinkedList
{
    Node front,rear;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public void enQueue(int data)
    {
        Node n1=new Node(data);
        if(isEmpty())
        {
            front=n1;
            rear=n1;
            return;
        }
        rear.next=n1;
        rear=n1;
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to delete!!!!");
            return;
        }
        front=front.next;
    }
    public void display()
    {
        Node curr=front;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        QueueWithLinkedList obj=new QueueWithLinkedList();
        for(int i=0;i<5;i++)
        {
            obj.enQueue(sc.nextInt());
        }
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}