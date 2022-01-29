import java.util.List;

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
        while(fast!=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Yes there exists a Loop in LinkedList!!!");
                Loop_Deletion(slow); //'slow' will be pointing to the mem
            }
        }
    }
    public void Loop_Deletion(ListNode slow)
    {
        ListNode ptr1= slow,ptr2=head;
        int k=0;
        while(ptr1.next!=slow)
        {
            ptr1=ptr1.next;
            k++;
        }
        ptr1=head;
        while (k!=-1)
        {
            ptr1=ptr1.next;
            k--;
        }
        while(ptr1!=ptr2)
        {
            ptr1=ptr1.next;     //ptr1.next and ptr2.next will be pointing to the junction
            ptr2=ptr2.next;     //and ptr1=ptr2 will hold the junction value
        }
        //As ptr1 is already on juction we need to get the last node so we will start the ptr1
        //and check if ptr1.next=ptr2(junction) we will break loop there and point it to null
        while(ptr1.next!=ptr2)
        {
            ptr1=ptr1.next;
        }
        ptr1.next=null;
//======================================================================================================================
//        for (ListNode curr = head; curr != null; curr = curr.next)
//        {
//            // start a pointer `ptr` from the `slow` node and
//            // check if it meets the current node `curr`
//            ListNode ptr = slow;
//            while (ptr.next != slow && ptr.next != curr) {
//                ptr = ptr.next;
//            }
//
//            // If `ptr` meets `curr`, then that means there is a loop, and `curr`
//            // points to the first node of the loop and `ptr` points to the last node
//            if (ptr.next == curr)
//            {
//                // set next pointer of `ptr` to `null` to break the chain
//                ptr.next = null;
//                return;
//            }
//        }
//        ===================================================================

        //        if(slow==fast)
//        {
//            if(slow.next==fast.next)
//            {
//                slow=head;
//                while(slow.next!=fast)
//                {
//                    slow=slow.next;
//                }
//                slow.next=null;
//            }
//        }
//        else
//        {
//            slow=head;
//            while(slow.next!=fast.next)
//            {
//                slow=slow.next;
//                fast=fast.next;
//            }
//            fast.next=null;
//        }
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
