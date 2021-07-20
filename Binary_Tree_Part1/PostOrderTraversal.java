class PostOrderTraversal
{
    public static void postOrderTraversal(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        postOrderTraversal(root);
    }
}