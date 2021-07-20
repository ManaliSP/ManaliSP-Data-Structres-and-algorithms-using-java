import java.util.*;
class BinaryTreeUse
{
    //static int node = 0;
    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft)
    {
        if(isRoot)
        {
            System.out.println("Enter root Data :");
        }else{
            if(isLeft)
            {
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, root.data, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, root.data , false);
        root.left = leftChild;
        root.right = rightChild;
        //node++;

        return root;
    }
    public static BinaryTreeNode<Integer> takeTreeInput()
    {
        System.out.println("Enter root Data :");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }
    static void printTreeDetailed(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null)
        {
            System.out.print("L" + root.left.data + ", ");
        }
        if(root.right != null)
        {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    static void printTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        // if(root.left != null)
        // {
        //     printTree(root.left);
        // }
        // if(root.right != null)
        // {
        //     printTree(root.right);
        // }
    }
    public static int numNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftChildCount = numNodes(root.left);
        int rightChildCount = numNodes(root.right);
        return 1 + leftChildCount + rightChildCount ;
    }

    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        // root.left = rootLeft;
        // root.right = rootRight;

        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);

        // rootRight.left = threeLeft;
        // rootLeft.right = twoRight;

        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println("No. of Nodes :" + numNodes(root));
    }
}