import java.util.*;
public class BinaryTreeUse
{
    //static int node = 0;
    public static BinaryTreeNode<Integer> takeTreeInputLevelWise()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root data :");
        int rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();

        pendingChildren.add(root);

        while(!pendingChildren.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter the left child of " + front.data);
            int left = sc.nextInt();
            if(left != -1)
            {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter the right child of " + front.data);
            int right = sc.nextInt();
            if(right != -1)
            {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }
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
    public static void printTreeLevelWise(BinaryTreeNode<Integer> root)
    {
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.print(front.data + ":");
            if(front.left != null)
            {
                System.out.print("L:" + front.left.data);
                pendingChildren.add(front.left);
            }else{
                System.out.print("L:-1");
            }
            if(front.right != null)
            {
                System.out.print(",R:" + front.right.data);
                pendingChildren.add(front.right);
            }else{
                System.out.print("R:-1");
            }
            System.out.println();
        }
    }
    public static void printTreeDetailed(BinaryTreeNode<Integer> root)
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

        //BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        //printTreeDetailed(root);
        BinaryTreeNode<Integer> root = takeTreeInputLevelWise();
        printTreeLevelWise(root);
        //System.out.println("No. of Nodes :" + numNodes(root));
    }
}