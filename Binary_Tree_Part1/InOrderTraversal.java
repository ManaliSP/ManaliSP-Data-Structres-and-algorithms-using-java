class InOrderTraversal
{
    public static void inOrderTraversal(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        inOrderTraversal(root);
    }
}