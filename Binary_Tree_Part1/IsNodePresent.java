import java.util.*;
class IsNodePresent
{
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int node)
    {
        if(root == null)
        {
            return false;
        }
        boolean ans = false;
        if(root.data == node)
        {
            return true;
        }
        ans = isNodePresent(root.left, node);
        if(ans)
        {
            return ans;
        }
        ans = isNodePresent(root.right, node);
        return ans;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        System.out.println("Node present is : " + isNodePresent(root, node));
    }
}