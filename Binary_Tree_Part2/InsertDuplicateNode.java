class InsertDuplicateNode
{
    public static BinaryTreeNode<Integer> insertDuplicateNode(BinaryTreeNode<Integer> root)
    {
        BinaryTreeNode<Integer> oldLeft;
        if(root == null)
        {
            return null;
        }
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);

        oldLeft = root.left;
        root.left = new BinaryTreeNode<>(root.data);
        root.left.left = oldLeft;
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        root = insertDuplicateNode(root);
        BinaryTreeUse.printTreeLevelWise(root);
    }
}