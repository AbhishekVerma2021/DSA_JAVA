import java.util.Scanner;
class PositionOutOfBoundError extends Exception
{
    PositionOutOfBoundError(String st)
    {
        System.out.println(st);
    }
}
class ll{
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
    public void addFirst(int data)
    {
        Node new1=new Node(data);
        if (head != null)
        {
            new1.next=head;
        }
        head=new1;
        //System.out.println("Sucessfully added!!!");
    }
    public void addLast(int data)
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
       // System.out.println("Sucessfully added!!!");
    }
    public void insertele(int data , int pos)
    {
        Node new1=new Node(data);
        if(head==null && pos==1)
        {
            head=new1;
        }
        else if(head==null && pos!=1)
        {
            try
            {
                throw new PositionOutOfBoundError("Error");
            }
            catch (PositionOutOfBoundError e)
            {
                System.out.println(e);
            }
        }
        else{
            Node currNode = head;
            while (pos != 2) {
                currNode = currNode.next;
                pos--;
            }
            Node tempNode = currNode.next;
            currNode.next = new1;
            new1.next = tempNode;
        }
        System.out.println("Sucessfully inserted!!!");
    }
    public void deleteele(int pos)
    {
        Node currNode=head;
        while (pos!=2)
        {
            currNode=currNode.next;
            pos--;
        }
        currNode.next=currNode.next.next;
        System.out.println("Sucessfully deleted!!!");
    }
    //BASIC LINKED LIST OPERATIONS
    public void display()
    {
        Node currNode=head;
        System.out.print(currNode.data+" ");


        while(currNode.next!=null)
        {

            System.out.print("");
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        ll l1 = new ll();
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD:");
//        for(int i=0;i<;i++)
//        {
//            l1.addFirst(sc.nextInt());
//        }
//        l1.display();
//        System.out.println("Add element at last!!!");
//        l1.addLast(sc.nextInt());
//        l1.display();
        System.out.println("Wanna add something in between!!!! give data and position: ");
        l1.insertele(sc.nextInt(), sc.nextInt());
        l1.display();
//        System.out.println("Wanna delete something!!!! give position:");
//        l1.deleteele(sc.nextInt());
//        l1.display();
    }
}
