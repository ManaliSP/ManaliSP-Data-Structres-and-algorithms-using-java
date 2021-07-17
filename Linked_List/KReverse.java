import java.util.*;
class KReverse
{
    static Node<Integer> kReverse(Node<Integer> head, int k)
    {
        if(head == null && k == 0)
        {
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> next = null;
        Node<Integer> prev = null;
        int count = 0;
        while(count < k && curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null)
        {
            head.next = kReverse(next, k);
        }
        return prev;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        head = kReverse(head, k);
        TakeInput1.printLinkedList(head);
    }
}