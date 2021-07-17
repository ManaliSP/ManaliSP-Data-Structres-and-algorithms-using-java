import java.util.*;
class KeepM_DeleteN_nodes
{
    static Node<Integer> keepM_DeleteN_nodes(Node<Integer> head, int m, int n)
    {
        if(m == 0)
        {
            return null;
        }
        Node<Integer> curr = head,rem;
        int count;
        while(curr != null)
        {
            for(count = 1; count<m && curr != null; count++)
            {
                curr = curr.next;
            }
            if(curr == null)
            {
                return head;
            }
            rem = curr.next;
            for(count = 1; count <= n && rem != null; count++)
            {
                Node<Integer> temp = rem;
                rem = rem.next;
            }
            curr.next = rem;
            curr = rem;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        head = keepM_DeleteN_nodes(head, m , n);
        TakeInput1.printLinkedList(head);
    }
}