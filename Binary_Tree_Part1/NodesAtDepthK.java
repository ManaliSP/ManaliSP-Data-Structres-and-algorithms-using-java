import java.util.*;
class NodesAtDepthK
{
    public static void nodesAtDepthK(BinaryTreeNode<Integer> root, int depth)
    {
        if(root == null)
        {
            return;
        }
        if(depth == 0)
        {
            System.out.println("Nodes at depth : " + root.data);
        }
        nodesAtDepthK(root.left, depth - 1);
        nodesAtDepthK(root.right, depth -1);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int depth = sc.nextInt();
        nodesAtDepthK(root,depth);
    }
}