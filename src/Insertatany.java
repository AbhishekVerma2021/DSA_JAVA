import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class ll1
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
    public void inslast(int data)
    {
        Node new1=new Node(data);
        Node currNode=head;
        if(head!=null)
        {
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.next=new1;
            new1.next=null;
        }
        else
        {
            head=new1;
        }
    }
    public void insele(int data, int pos)
    {
        Node new1= new Node(data);
        Node currNode=head;
        if(head==null && pos==1)
        {
            head=new1;
        }
        else {

            while (pos != 2) {
                currNode = currNode.next;
                pos--;
            }
            Node tempNode = currNode.next;
            currNode.next = new1;
            new1.next = tempNode;
        }
    }
    public void display()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + " ");
            currNode=currNode.next;
        }
    }
}
public class Insertatany{

    public static void main(String[] args)
    {
        ll1 l1=new ll1();
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            l1.inslast(sc.nextInt());
        }
        int data=sc.nextInt(),p=sc.nextInt();
        l1.insele(data,p);
        l1.display();
    }
}