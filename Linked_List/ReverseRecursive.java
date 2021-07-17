class DoubleNode
{
    DoubleNode head;
    DoubleNode tail;
    DoubleNode(){}
    DoubleNode(DoubleNode head, DoubleNode tail)
    {
        this.head = head;
        this.tail = tail;
    }
}
class ReverseRecursive
{
    static Node<Integer> reverseRecursive(Node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }else{
        Node<Integer> reverseHead = reverseRecursive(head.next);
        Node<Integer> temp = reverseHead;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        head.next = null;
        temp.next = head;
        return reverseHead;
    }
    }
    static Node<Integer> reverseRecursiveOptimised(Node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node<Integer> reverseHead = reverseRecursive(head.next);
        Node<Integer> reverseTail = head.next;
        head.next = null;
        reverseTail.next = head;
        return reverseHead;
    }
    // static DoubleNode reverseRecursiveOptimised(Node<Integer> head)
    // {
    //     DoubleNode ans;
    //     if(head == null || head.next == null)
    //     {
    //         ans = new DoubleNode();
    //         ans.head = head;
    //         ans.tail = head;
    //         return ans;
    //     }
    //     DoubleNode reverseHead = reverseRecursiveOptimised(head.next);
    //     reverseHead.tail.next = head;
    //     head.next = null ;
    //     ans = new DoubleNode();
    //     ans.head = reverseHead.head;
    //     ans.tail = head;
    //     return ans;
    // }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = reverseRecursiveOptimised(head);
        TakeInput1.printLinkedList(head);
    }
}