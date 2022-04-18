public class BinarySearchTree
{
    static BinaryNode root;
    static class BinaryNode
    {
        int data;
        BinaryNode left,right;
        public BinaryNode(int data)
        {
            this.left=this.right=null;
            this.data=data;
        }
    }
    static void insert(int data)
    {
        root=insertion(root,data);
    }
    static public BinaryNode insertion(BinaryNode root,int data)
    {
        BinaryNode n1= new BinaryNode(data);
        if(root==null)
        {
            root=n1;
            return root;
        }
        if(data< root.data)
        {
            root.left=insertion(root.left,data);
        }
        else {
            root.right = insertion(root.right, data);
        }
        return root;
    }
    static void inorderRec(BinaryNode root)
    {
        if (root != null) {


            System.out.println(root.data);
            inorderRec(root.left);
            inorderRec(root.right);

        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,7,1,3};
        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]);
        }
        inorderRec(root);
    }
}
