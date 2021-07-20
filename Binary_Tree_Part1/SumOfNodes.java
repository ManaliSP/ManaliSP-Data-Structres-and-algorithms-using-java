class SumOfNodes
{
    public static int sumOfNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int sum = 0;
        sum = root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
        return sum;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Sum is : " + sumOfNodes(root));
        BinaryTreeUse.printTreeDetailed(root);
    }
}