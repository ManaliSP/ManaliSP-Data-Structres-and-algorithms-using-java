import java.util.*;
class SwapTwoNodes
{
    static Node<Integer> swapTwoNodes(Node<Integer> head, int i, int j)
    {
        Node<Integer> temp1 = head;
        Node<Integer> node1 = head;
        Node<Integer> node2 = head;
        if(head == null || head.next == null)
        {
            return head;
        }
        for(int a = 0; a<i  && node1 != null; a++)
        {
            node1 = node1.next;
        }
        for(int b = 0; b<j && node2 != null; b++)
        {
            node2 = node2.next;
        }
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;  
        return temp1;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        head = swapTwoNodes(head,i,j);
        TakeInput1.printLinkedList(head);
    }
}