import java.util.*;
class SearchBST
{
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int data)
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
            return searchInBST(root.left, data);
        }
        return searchInBST(root.right, data);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println(searchInBST(root, data));
    }
}