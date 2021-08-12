class RemoveLeafNodes
{
    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left == null && root.right == null)
        {
            return null;
        }
        root.left = removeLeafNodes(root.left);
        root.right =  removeLeafNodes(root.left);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        BinaryTreeUse.printTreeDetailed(root);
        root = removeLeafNodes(root);
        System.out.println("After removing leaf nodes : ");
        BinaryTreeUse.printTreeDetailed(root);
    }
}