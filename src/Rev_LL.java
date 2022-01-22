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
        if(head!=null)
        {
            new1.next=head;

        }
        head=new1;
        System.out.println("Inserted!!!");
    }
    public void revList()
    {
        Node currnode=head;
        Node temp= currnode.next.next;  //temp=n3
        currnode.next.next=currnode;
        currnode=currnode.next;         //n1=n2
        head.next=null;                 //n1.next=null
        while(temp!=null)
        {
                head=temp;
                temp=temp.next;
                head.next=currnode;
                currnode=head;
        }
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
        for(int i=0;i<5+5;i++)
        {
            l1.inputdata(sc.nextInt());
        }
        l1.display();
        System.out.println("___________________");
        l1.revList();
        l1.display();
    }
}
