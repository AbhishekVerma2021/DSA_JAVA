public class LoopStart
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
    public void LoopIdentify()
    {
        ListNode fast=head,slow=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                if(slow==head)
                {
                    slow=head;
                    while(slow.next!=fast)
                    {
                        slow=slow.next;
                    }
                    System.out.println("Starting point = "+ fast );
                    System.out.println("Ending point = "+ slow);
                }
                else
                {
                    ListNode ptr1=slow,ptr2=head;
                    int k=0;
                    while(ptr1.next!=slow)
                    {
                        ptr1=ptr1.next;
                        k++;
                    }
                    ptr1=head;
                    for(int i=1;i<k;i++)
                    {
                        ptr1=ptr1.next;
                    }
                    while(ptr2.next!=ptr1.next)
                    {
                        ptr1=ptr1.next;
                        ptr2=ptr2.next;
                    }
                    while(ptr1.next!=ptr2)
                    {
                        ptr1=ptr1.next;
                    }
                    ptr1.next=null;
                    System.out.println("Starting point = " + ptr2);
                    System.out.println("Ending point = "+ ptr1);
                }
            }
        }
    }
    public void display()
    {
        ListNode currNode=head;
        System.out.print(currNode.data+" ");


        while(currNode.next!=null)
        {

            System.out.print("");
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public static void main(String[] args)
    {
        LoopStart list=new LoopStart();
        list.head = new ListNode(50);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(15);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = head.next.next;
        list.LoopIdentify();

    }
}
