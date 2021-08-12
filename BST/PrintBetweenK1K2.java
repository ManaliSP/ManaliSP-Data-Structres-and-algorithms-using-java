import java.util.*;
class PrintBetweenK1K2
{
    public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }
        if(root.data < k1)
        {
            printBetweenK1K2(root.left, k1, k2);
        }else if(root.data > k2)
        {
            printBetweenK1K2(root.right, k1, k2);
        }else{
            printBetweenK1K2(root.right, k1,k2);
            System.out.print(root.data+" ");
            printBetweenK1K2(root.left,k1,k2);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        printBetweenK1K2(root, k1, k2);
    }
}