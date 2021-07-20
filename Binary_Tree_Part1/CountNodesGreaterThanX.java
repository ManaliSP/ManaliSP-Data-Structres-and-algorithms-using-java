import java.util.*;
class CountNodesGreaterThanX
{
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int elem)
    {
        if(root == null)
        {
            return 0;
        }
        int leftCount = countNodesGreaterThanX(root.left, elem);
        int rightCount = countNodesGreaterThanX(root.right, elem);

        return (root.data > elem ? 1 : 0) + leftCount +rightCount;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("No of Nodes greater : " + countNodesGreaterThanX(root,x));
    }
}