class MirrorBinaryTree
{
    public static BinaryTreeNode<Integer> mirrorBinaryTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        BinaryTreeNode<Integer> temp = root.right;
        root.right = root.left;
        root.left = temp;

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        BinaryTreeUse.printTreeDetailed(root);
        root = mirrorBinaryTree(root);
        BinaryTreeUse.printTreeDetailed(root);

    }
}