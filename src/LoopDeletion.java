
public class LoopDeletion
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
    public void LoopDetectionAndDeletion()
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Yes there exists a Loop in LinkedList!!!");
                Loop_Deletion(slow);
            }
        }
    }
    public void Loop_Deletion(ListNode LoopPoint)
    {
        ListNode p1=LoopPoint;
        ListNode p2=LoopPoint;
        ListNode currNode=head;
//        int k=0;
//        while(p1!=p2)
//        {
//            p1=p1.next;
//            k++;
//        }
        p1=LoopPoint;
        while(true)
        {
            currNode=p1;
            if(p1.next==p2)
            {

                break;
            }
            p1=p1.next;
        }
        currNode.next=null;
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
        LoopDeletion list= new LoopDeletion();
        list.head = new ListNode(50);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(15);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = head.next.next;
        list.LoopDetectionAndDeletion();
        list.display();
    }
}
