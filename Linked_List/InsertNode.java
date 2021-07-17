import java.util.*;
class InsertNode
{
    static Node<Integer> insertNode(Node<Integer> head, int data, int pos)
    {
            // Node<Integer> newNode = new Node<>(data);
            // if(pos == 0)
            // {
            //     newNode.next = head;
            //     return newNode;
            // }
            // else{
            //     int count = 0;
            //     Node<Integer> prev = head;
            //     while(count < pos-1 && prev != null)
            //     {
            //         count++;
            //         prev = prev.next;
            //     }
            //     if(prev != null)
            //     {
            //         newNode.next = prev.next;
            //         prev.next = newNode;
            //     }
            //     return head;
            // }
        Node<Integer> nodeToBeInserted = new Node<Integer>(data);
        if(pos==0)
        {
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }
        else
        {
            int count = 0;
            Node<Integer> prev = head;
            while(count<pos-1 && prev != null)
            {
                count++;
                prev = prev.next;
            }
            if(prev != null)
            {
                nodeToBeInserted.next=prev.next;
                prev.next = nodeToBeInserted;
            }
            return head;
        }
        
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        TakeInput1.printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int pos = sc.nextInt();
        head = insertNode(head,data,pos);
        TakeInput1.printLinkedList(head);
    }
}