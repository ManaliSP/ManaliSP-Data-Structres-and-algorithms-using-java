import java.util.*;
class DeleteNode
{
    static Node<Integer> deleteNode(Node<Integer> head, int pos)
    {
        if (head == null){
            return head;
        }
        if (pos == 0){
            return head.next;
        }
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null){
            if (count == pos - 1){
                if (temp.next != null)
                	temp.next = temp.next.next;
            }
            count++;
            temp = temp.next;
        } 
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        TakeInput1.printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        head = deleteNode(head, pos);
        TakeInput1.printLinkedList(head);
    }
}