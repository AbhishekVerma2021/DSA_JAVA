import java.util.Scanner;
class l5<T>
{
    ListNode<Integer> head;
    class ListNode<T>
    {
        T data;
        ListNode<T> next;
        ListNode(T data)
        {
            this.data = data;
        }
    }
    public ListNode createLinkedList(int size)
    {
        Scanner sc = new Scanner(System.in);
        ListNode<Integer> new1= new ListNode<Integer>(sc.nextInt());
        head=new1;
        ListNode<Integer> currNode=head;
        for(int i=0;i<size-1;i++)
        {
            currNode=new1;
            new1=new ListNode<>(sc.nextInt());
            currNode.next=new1;
        }
        return head;
    }
    public void display(ListNode currNode)
    {
        while(currNode!=null)
        {
            System.out.println(currNode.data + " ");
            currNode=currNode.next;
        }

    }
    public boolean Loopdetection(ListNode currNode)
    {
        if(currNode==null)
        {
            return false;
        }
        ListNode first=currNode;
        ListNode second=currNode;
        while (second.next!=null && second.next.next!=null)
        {
            first=first.next;
            second=second.next.next;
            if (first==second)
            {
                return true;
            }
        }
        return false;
    }
    public void loopcreation()
    {
//        ListNode currNode=head;
//        while(currNode.next!=null)
//        {
//            currNode=currNode.next;
//        }
//        currNode.next=head;
//        System.out.println(Loopdetection(currNode));
    }
}
public class LoopList
{
    public static void main(String[] args)
    {
        l5<Integer> l1 = new l5<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        l5.ListNode l2 = l1.createLinkedList(size);
        l1.display(l2);
        System.out.println("-----------------------");
        l1.Loopdetection(l2);
        l1.loopcreation();
        l1.display(l2);
    }
}



























