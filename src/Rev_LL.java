import java.util.Scanner;

class linkedl
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void inputdata(int data)
    {
        Node new1=new Node(data);
        if(head==null)
        {
            head=new1;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=new1;
        new1.next=null;
    }
    public void revList()
    {
        Node currNode= head;
        Node prev= null;
        while(currNode!=null)
        {
            Node temp = currNode.next;  // temp=n2
            currNode.next=prev;         // n1->null
            prev=currNode;              // prev=n1
            currNode=temp;              // currNode=n2

        }
        head=prev;
    }
    public void display()
    {
        Node currNode=head;
        System.out.print(currNode.data+" ");


        while(currNode.next!=null)
        {
            System.out.print("");
            currNode=currNode.next;
            System.out.print(currNode.data+" ");
        }
    }
}
public class Rev_LL
{
    public static void main(String[] args)
    {
        linkedl l1 = new linkedl();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            l1.inputdata(sc.nextInt());
        }
        l1.display();
        System.out.println("___________________");
        l1.revList();
        l1.display();
    }
}