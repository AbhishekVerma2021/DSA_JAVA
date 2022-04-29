import java.util.*;
public class SUMUPLINKEDLIST
{
    static class ListNode
    {
        int val;
        ListNode next;
        public ListNode(int val)
        {
            this.val=val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int n1=0,n2=0;
        ListNode currNode1=l1,currNode2=l2;
        Stack<Integer> st1=new Stack<>();
        while(currNode1!=null)
        {
            st1.push(currNode1.val);
            currNode1=currNode1.next;
        }
        Stack<Integer> st2=new Stack<>();
        while(currNode2!=null)
        {
            st2.push(currNode2.val);
            currNode2=currNode2.next;
        }
        Stack<Integer> st3=new Stack<>();
        while(!st1.isEmpty())
        {
            n1=st1.pop()+10*n1;
        }
        while(!st2.isEmpty())
        {
            n2=st2.pop()+10*n2;
        }
        int res=n1+n2;
        ListNode curr=l1;
        curr.next=null;


        int i=0;
        while(res!=0)
        {
            curr.val=res%10;
            res/=10;
            curr=curr.next;
        }

        return l1;
    }
    public static void main(String[] args) {

    }
}
