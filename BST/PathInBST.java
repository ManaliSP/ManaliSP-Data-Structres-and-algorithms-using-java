import java.util.*;
class PathInBST
{
    public static ArrayList<Integer> pathInBST(BinaryTreeNode<Integer> root, int data)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == data)
        {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> output; 
        if(data < root.data )
        {
            output = pathInBST(root.left,data);
            if(output !=null)
            {
                output.add(root.data);
            	return output;
            }
        }
        if(data >= root.data)
        {
            output = pathInBST(root.right, data);
            if(output !=null)
        	{
                output.add(root.data);
                return output;
        	}
        }
        return null;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> path = pathInBST(root,x);
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