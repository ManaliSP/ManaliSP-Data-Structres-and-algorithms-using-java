import java.util.*;
class BSTFromSortedArray
{
    public static BinaryTreeNode<Integer> constructTree(int arr[], int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = constructTree(arr, start, mid-1);
        root.right = constructTree(arr, mid + 1, end);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        BinaryTreeNode<Integer> root = constructTree(arr,0,n-1);
        BinaryTreeUse.printTreeLevelWise(root);
    }
}
