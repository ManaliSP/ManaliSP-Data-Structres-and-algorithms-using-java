class MidPoint
{
    static Node<Integer> midPoint(Node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        if(head.next.next == null)
        {
            return new Node<Integer>(head.data);
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return new Node<Integer>(slow.data);
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput1.takeInputOptimized();
        head = midPoint(head);
        TakeInput1.printLinkedList(head);
    }
}