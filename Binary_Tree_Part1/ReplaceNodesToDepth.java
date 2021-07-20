class ReplaceNodesToDepth
{
    public static void replaceNodesToDepth(BinaryTreeNode<Integer> root, int level)
    {
        if(root == null)
        {
            return;
        }
        root.data = level;
        replaceNodesToDepth(root.left, level + 1);
        replaceNodesToDepth(root.right , level + 1);
        InOrderTraversal.inOrderTraversal(root);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        replaceNodesToDepth(root,0);
    }
}