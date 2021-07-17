import java.util.*;
class FindNode
{
    static int findNode(Node<Integer> head, int searchNode)
    {
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            if(temp.data==searchNode)
            {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        TakeInput1.printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        int searchNode = sc.nextInt();
        int node = findNode(head,searchNode);
        System.out.print(node);
    }
}