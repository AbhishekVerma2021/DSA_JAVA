import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class PalindromeLinkedList
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
    public boolean palindrome()
    {
        if(head==null)
        {
            return true;
        }
        if(head.next==null)
        {
            return true;
        }
        if(head.next.next==null)
        {
            ListNode currNode=head;

        }
        int size=0;
        ListNode currNode=head;
        while(currNode!=null)
        {
            size++;
            currNode=currNode.next;
        }
        ListNode midNode=head;
        int size3=size/2 ;
        while(size3!=0)
        {
            midNode=midNode.next;
            size3--;
        }
        size3=size/2;
        System.out.println(size3);
        currNode=head;
        ListNode prevNode=null;
        size--;
        while(currNode!=null)
        {
            ListNode tempNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=tempNode;
            if(size==size3)
            {
                break;
            }
            size--;
        }
        currNode=head;
        while (currNode!=null)
        {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        while (midNode!=null)
        {
            System.out.println("mid="+midNode.data);
            midNode=midNode.next;
        }
        head=prevNode;
        currNode=head;
        int k=0;
        while (currNode!=null)
        {
            if(currNode.data== midNode.data)
            {
                currNode = currNode.next;
                midNode = midNode.next;
            }
            else
            {
                k--;
                break;
            }
        }
        if(k==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void inputdata(int data)
    {
        ListNode new1=new ListNode(data);

        if(head==null)
        {
            head=new1;
            return;
        }
        ListNode currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=new1;

    }
    public void display()
    {
        ListNode currNode=head;
        while(currNode!=null)
        {
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {
        PalindromeLinkedList list=new PalindromeLinkedList();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            list.inputdata(sc.nextInt());
        }
        list.display();
        System.out.println(list.palindrome());

    }
}
