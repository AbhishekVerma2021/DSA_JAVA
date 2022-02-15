public class ASSIGNMENT1_01
{
    ListNode next;
    static class ListNode
    {
        int data;
        ListNode next,front,rear;
        public ListNode(int data)
        {
            data=this.data;
        }
    }
    public void inp(String str)
    {
        char[] ch=str.toCharArray();
        String str1="";
//        if(str.length()/2%2==0)
//        {
            for(int i=str.length()/2-2;i>=0;i--)
            {
                str1+=ch[i];
            }
//            str1+=ch[str.length()/2-1];
            for(int i=str.length()-1;i>str.length()/2;i--)
            {
                str1+=ch[i];
            }
//        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        ASSIGNMENT1_01 obj=new ASSIGNMENT1_01();
        obj.inp("Abhihek");
    }
}
