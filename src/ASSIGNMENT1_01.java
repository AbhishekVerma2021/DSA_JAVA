import java.util.List;
import java.util.Scanner;

public class ASSIGNMENT1_01
{
    ListNode next,front,rear;
    static class ListNode
    {
        char data;
        ListNode next,front,rear;
        public ListNode(char data)
        {
            this.data=data;
        }
    }
    public char[] inp(String str)
    {
        char[] ch=str.toCharArray();
        String str1="";
        if(str.length()/2%2==0)
        {
            for(int i=str.length()/2-2;i>=0;i--)
            {
                str1+=ch[i];
            }
            str1+=ch[str.length()/2-1];
            for(int i=str.length()-1;i>=str.length()/2;i--)
            {
                str1+=ch[i];
            }
        }
        else
        {
            for(int i=str.length()/2-1;i>=0;i--)
            {
                str1+=ch[i];
            }
            str1+=ch[str.length()/2];
            for(int i=str.length()-1;i>str.length()/2;i--)
            {
                str1+=ch[i];
            }
        }
        return str1.toCharArray();
    }
    public void linklistinp(char[] str)
    {
        for(int i=0;i<str.length;i++)
        {
            ListNode n1 = new ListNode(str[i]);
            if (front == null && rear == null)
            {
                front = n1;
                rear = n1;
                rear.next=null;
            }
            else
            {
                ListNode curr=front;
                while(curr!=rear)
                {
                    curr=curr.next;
                }
                curr.next=n1;
                rear=n1;
            }
        }
    }
    public void display()
    {
        ListNode curr=front;
        while(curr!=rear.next)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        ASSIGNMENT1_01 obj=new ASSIGNMENT1_01();
        Scanner sc=new Scanner(System.in);
        char[] str = obj.inp(sc.nextLine());
        obj.linklistinp(str);
        obj.display();
    }
}
