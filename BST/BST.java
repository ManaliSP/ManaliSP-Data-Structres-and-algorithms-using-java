class BST 
{
    private BinaryTreeNode<Integer> root;  // = new BinaryTreeNode<Integer>();
    private int size;

    BST()
    {
        size = 0;
    }
    public void insert(int data)
    {

    }
    public static boolean isPresentHelper(BinaryTreeNode<Integer> root, int data)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == data)
        {
            return true;
        }
        if(data < root.data)
        {
            return isPresentHelper(root.left, data);
        }else{
            return isPresentHelper(root.right, data);
        }
    }
    public boolean isPresent(int data)
    {
        return isPresentHelper(root, data);
    }
    public int size()
    {
        return size;
    }
    public static void printTreeHelper(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + ": ");
        if(root.left != null)
        {
            System.out.print("L" + root.left.data + ", ");
        }
        if(root.right != null)
        {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
    public void printTree()
    {
        printTreeHelper(root);
    }
    private static BSTReturn deleteDataHelper(BinaryTreeNode<Integer> root, int data)
    {
        if(root == null)
        {
            return new BSTReturn(null, false);
        }
        if(root.data < data)
        {
            BSTReturn  rightOutput = deleteDataHelper(root.right, data);
            root.right = rightOutput.root;
            rightOutput.root =root;
            return rightOutput;
        }
        if(root.data > data)
        {
            BSTReturn  leftOutput = deleteDataHelper(root.left, data);
            root.left = leftOutput.root;
            leftOutput.root =root;
            return leftOutput;
        }

        if(root.left == null && root.right == null)
        {
            return new BSTReturn(null, true);
        }

        if(root.left != null && root.right == null)
        {
            return new BSTReturn(root.left, true);
        }

        if(root.left == null && root.right != null)
        {
            return  new BSTReturn(root.right, true);
        }
        int rightMin = minimum(root);

        root.data = rightMin;
        BSTReturn rightOutput = deleteDataHelper(root.right, rightMin);
        root.right = rightOutput.root;
        return new BSTReturn(root, true);
    }

    public static int minimum(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return Integer.MAX_VALUE;
        }
        
        int rightMin = minimum(root.right);
        int leftMin = minimum(root.left);

        return Math.min(root.data, Math.min(rightMin, leftMin));
    }
    public boolean deleteData(int data)
    {
        BSTReturn output = deleteDataHelper(root, data);
        root = output.root;
        if(output.deleted)
        {
            size--;
        }
        return output.deleted;
    }
}

class BSTReturn
{
    BinaryTreeNode<Integer> root;
    boolean deleted;
    BSTReturn(BinaryTreeNode<Integer> root, boolean deleted)
    {
        this.root = root;
        this.deleted = deleted;
    }
}
class BSTUse
{
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(3);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(2);

        System.out.println(tree.isPresent(5));
        tree.deleteData(5);
        System.out.println(tree.isPresent(5));

        System.out.println(tree.size());

        tree.printTree();
    }
}