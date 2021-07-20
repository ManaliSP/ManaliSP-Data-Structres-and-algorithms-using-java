class PreorderTreversal
{
    public static void preOrderTreversal(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
                return;
        }
        System.out.print(root.data + " ");
        preOrderTreversal( root.left);
        preOrderTreversal(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        preOrderTreversal(root);
    }
}