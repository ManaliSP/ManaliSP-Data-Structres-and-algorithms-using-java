class NodesWithoutSiblings
{
    public static void nodesWithoutSiblings(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null && root.right == null)
        {
            System.out.println(root.left.data + " ");
        }  
        if(root.left == null && root.right != null)
        {
            System.out.println(root.right.data + " ");
        }
        nodesWithoutSiblings(root.left);
        nodesWithoutSiblings(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
        nodesWithoutSiblings(root);
    }
}