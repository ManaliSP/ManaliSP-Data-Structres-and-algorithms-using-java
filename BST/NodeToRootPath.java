import java.util.*;
class NodeToRootPath
{
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == x)
        {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
        if(leftOutput != null)
        {
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
        if(rightOutput != null)
        {
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> path = nodeToRootPath(root,x);
        if(path == null)
        {
            System.out.println("Not Found.");
        }else{
            for(int i:path)
            {
                System.out.print(i + " ");
            }
        }
    }
}