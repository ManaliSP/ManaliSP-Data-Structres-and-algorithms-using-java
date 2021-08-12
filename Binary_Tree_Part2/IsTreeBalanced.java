class BalancedTree
{
    int height;
    boolean isBalanced;
}
class IsTreeBalanced
{
    public static BalancedTree isTreeBalancedBetter(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            int height = 0;
            boolean isBalanced = true;
            BalancedTree ans = new BalancedTree();
            ans.height = height;
            ans.isBalanced = true;
            return ans;
        }

        BalancedTree leftOutput = isTreeBalancedBetter(root.left);
        BalancedTree rightOutput = isTreeBalancedBetter(root.right);

        boolean isBalanced = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);
        
        if(Math.abs(leftOutput.height - rightOutput.height) > 1)
        {
            isBalanced = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced)
        {
            isBalanced = false;
        }

        BalancedTree ans = new BalancedTree();
        ans.height = height;
        ans.isBalanced = isBalanced;
        return ans;
    }

    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static boolean isTreeBalanced(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        // System.out.println("left : " + leftHeight + " right : " + rightHeight);

        if(Math.abs(leftHeight - rightHeight) > 1)
        {
            return false;
        }
        boolean isLeftBalanced = isTreeBalanced(root.left);
        boolean isRightBalanced = isTreeBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println(isTreeBalancedBetter(root).isBalanced);
    }
}