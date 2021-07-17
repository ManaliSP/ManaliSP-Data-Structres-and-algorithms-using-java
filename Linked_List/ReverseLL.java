import java.util.*;
class ReverseLL
{
    static int length(Node<Integer> head)
    {
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    static void reverseLL(Node<Integer> head)
    {
        Node<Integer> temp = head;
        int len = length(head);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        for(int i = len - 1; i >= 0; i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        TakeInput1.printLinkedList(head);
        reverseLL(head);
    }
}