class NumberOfLeafNodes
{
    public static int numberOfLeafNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return 1;
        }
        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Number Of leaf nodes : " + numberOfLeafNodes(root));
    }
}