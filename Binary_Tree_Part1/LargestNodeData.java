class LargestNodeData
{
    public static int largestNodeData(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return -1;
        }
        int largestLeft = largestNodeData(root.left);
        int largestRight = largestNodeData(root.right);
        return Math.max(root.data,Math.max(largestLeft, largestRight));
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Largest Node Data : " + largestNodeData(root));
    }
}