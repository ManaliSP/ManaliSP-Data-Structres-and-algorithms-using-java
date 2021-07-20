class HeightOfTree
{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.left);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Height of Tree : " + height(root));
    }
}