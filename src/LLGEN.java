class ll3
{
    Node head;
    public static class Node<T>
    {
        T data;
        Node<T> next;
        Node(T data)
        {
            this.data=data;
        }
    }
    public Node<Integer> createLinkdList()
    {
        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2= new Node<>(11);
        Node<Integer> n3= new Node<>(12);
        n1.next=n2;
        n2.next=n3;
        return n1;
    }
    public void display(Node n1)
    {
        Node currNode=n1;
        while(currNode!=null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}
public class LLGEN
{
    public static void main(String[] args) {
        ll3 l1=new ll3();
//      l1.display(l1.createLinkedList());
        ll3.Node<Integer> l3=l1.createLinkdList();
        l1.display(l3);
    }
}
