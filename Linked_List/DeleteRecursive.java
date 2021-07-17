import java.util.*;
class DeleteRecursive
{
    static Node<Integer> deleteRecursive(Node<Integer> head, int pos)
    {
        if(head == null)
        {
            return head;
        }
        if(pos == 0)
        {
            return head.next;
        }else{
            head.next = deleteRecursive(head.next,pos-1);
            return head;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        head = deleteRecursive(head,pos);
        TakeInput1.printLinkedList(head);
    }
}