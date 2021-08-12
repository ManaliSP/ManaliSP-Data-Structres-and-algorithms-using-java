class Diameter
{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    public static int getDiameter(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return  0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDia = getDiameter(root.left);
        int rightDia = getDiameter(root.right);

        return Math.max((leftHeight + rightHeight + 1), Math.max(leftDia,rightDia));
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Diameter : " + getDiameter(root));
    }
}